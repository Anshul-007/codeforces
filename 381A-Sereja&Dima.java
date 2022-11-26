package Practice;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.math.*;
import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
import java.util.Scanner;
//import java.util.Collections;

//import java.util.stream.Stream;

public class ProblemA {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt1=0, cnt2=0;
		int option =0;
		int l=0, h=n-1;
		while(h>=l) {
			switch(option) {
			case 0: if(arr[l]>arr[h]) {
						cnt1+=arr[l];
						l++;
					}
					else {
						cnt1+=arr[h];
						h--;
					}
					option =1;
					break;
			case 1: if(arr[l]>arr[h]) {
						cnt2+=arr[l];
						l++;
					}
					else {
						cnt2+=arr[h];
						h--;
					}
					option =0;
					//System.out.println(cnt2+" "+l+" "+h);
					break;
			
			}
		}
		System.out.println(cnt1+" "+cnt2);
//		while(t-->0) {
//			int n = sc.nextInt();
//			
//			
//		}
		sc.close();
	}
	
}
