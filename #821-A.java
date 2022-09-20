package Practice;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
//import java.util.Collections;

//import java.util.stream.Stream;

public class ProblemA {
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	
	Map<Integer, ArrayList<Long>> map = new HashMap<Integer,ArrayList<Long>>();
	while(t-- > 0) {
		int length = sc.nextInt(); //length =7
		int k = sc.nextInt();
		int arr[] = new int[length];
		//inserting  in an array
		for(int i = 0; i<length; i++) {
			arr[i] = sc.nextInt();
		}
		//[4,2,3,6,7,4,3]
		
		//now we are gonna iterate over the array 
		//also we are going to store the value in (i%k) key
		for(int i = 0; i<k; i++) {
			ArrayList<Long> value = new ArrayList<Long>();
			long max = Integer.MIN_VALUE;
			
			for(int j = i; j<length; j+=k) {
				max = Math.max(max, arr[j]);
				//System.out.println(max + " "+ i%k);
				
			}
			value.clear();
			value.add(max);
			map.put((i%k), value);
			
			
		}
		System.out.println(map);
		long sum =0;
		for(int i = 0; i<k; i++) {
			sum += map.get(i).get(0);
		}
	System.out.println(sum);
	
	}
	}
	
}
