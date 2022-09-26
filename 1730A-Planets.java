//package Practice;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
//import java.util.Collections;
 
//import java.util.stream.Stream;
 
public class ProblemA {
    
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[] =new int[n];
			int sum =0;
			HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
			for(int i = 0; i<n; i++) {
				
				arr[i]= sc.nextInt();
			}
			
			for(int i =0 ; i<n;i++) {
				map.put(arr[i], (map.getOrDefault(arr[i], 1))+1);
			}
			int l =0;
			for ( Map.Entry<Integer, Integer> entry : map.entrySet()) {
			    int tab = entry.getValue()-1;
//			    System.out.println(tab);
			    if(tab>k) {
			    	sum+=k;
			    }
			    else
			    	sum+=tab;
			    
			    	
			}
			System.out.println(sum);
		}
		
		sc.close();
	}
}
