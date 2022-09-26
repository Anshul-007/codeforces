//package Practice;
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
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0; i<n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
//			for (int i = 0; i < arr.length; i++) {
//					System.out.println(arr[i]);
//			}
			int max_ops = Integer.MAX_VALUE;
			for(int i =0; i<=arr.length-3;i++) {
				//System.out.println("here");
				int temp = Math.abs(arr[i]-arr[i+1]);
				int temp1 = Math.abs(arr[i+1]-arr[i+2]);
				int sum = temp + temp1;
				//System.out.println(sum);
				if(sum<max_ops) {
					max_ops = sum;
					//System.out.println(max_ops);
				}
			}
			System.out.println(max_ops);
				
		}
	
	}
	
}
