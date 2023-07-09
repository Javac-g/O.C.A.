import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ChatClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 1234;

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("Connected to the server: " + serverAddress);

            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

            String username;
            System.out.print("Enter your username: ");
            username = consoleReader.readLine();
            writer.println(username);

            new ServerListener(reader).start();

            String message;

            while (true) {
                message = consoleReader.readLine();
                writer.println(message);
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ServerListener extends Thread {
        private BufferedReader reader;

        public ServerListener(BufferedReader reader) {
            this.reader = reader;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String message = reader.readLine();
                    if (message == null) {
                        break;
                    }
                    System.out.println("Server: " + message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
