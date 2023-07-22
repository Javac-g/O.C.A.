package package_c;

import java.util.ArrayList;
import java.util.List;

public class Boxing{
	public static void main(String...args){
		List<Integer> list = new ArrayList<>();
		for (int i = 0,j=0;i < 100 ;i+=10,j++ ) {
			list.add(j,i);
		}
		System.out.println(list);
	}
}