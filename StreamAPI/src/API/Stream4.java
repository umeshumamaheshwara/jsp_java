package API;

import java.util.Arrays;
import java.util.stream.Stream;

public class Stream4 {
	public static void main(String[] args) {
		int[] arr= {78,7,5,84,78};
		
		Arrays.stream(arr).distinct().forEach(System.out::println);
		
	}

}
