import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    private static final int PORT = 1234;
    private static Map<String, PrintWriter> connectedClients = new HashMap<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("Server started on port " + PORT);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket.getInetAddress().getHostAddress());

                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

                String username = reader.readLine();
                connectedClients.put(username, writer);
                System.out.println("User registered: " + username);

                new ClientHandler(clientSocket, username).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket clientSocket;
        private String username;

        public ClientHandler(Socket socket, String username) {
            this.clientSocket = socket;
            this.username = username;
        }

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                while (true) {
                    String message = reader.readLine();
                    if (message == null) {
                        System.out.println("User disconnected: " + username);
                        connectedClients.remove(username);
                        break;
                    }
                    System.out.println(username + ": " + message);
                    broadcastMessage(username + ": " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void broadcastMessage(String message) {
        for (PrintWriter writer : connectedClients.values()) {
            writer.println(message);
            writer.flush();
        }
    }
}
