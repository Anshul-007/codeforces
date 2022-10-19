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
			//ArrayList<String> al= new ArrayList<String>();
			//taking input as string and storing the frequency inside 
			//freq map
			int arr[] = new int[26];
			Arrays.fill(arr,0);
			String s ;
			for(int j =0; j<2; j++) {
				s = sc.next();
				for(int i = 0; i<s.length();i++) {
					arr[s.charAt(i)-'A'] +=1;
				}
			}
//			for(int i =0; i<26; i++) {
//			 System.out.println(arr[i]);
//			}
			for(int i =0; i<1; i++) {
				s = sc.next();
				for(int j=0; j<s.length(); j++) {
				arr[s.charAt(j)-'A'] -=1;
				}
			}
			boolean flag = false;
			for(int i=0; i<arr.length;i++) {
				if(arr[i]!=0) {
					flag =true;
				}
			}
			if(flag) 
				System.out.println("NO");
			else
				System.out.println("YES");
		}
}
