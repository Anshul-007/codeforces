package Practice;
import java.io.IOException;
import java.io.InputStreamReader;
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
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			int temp[] = new int[n+1];
			Arrays.fill(temp, 0);
			int freqvar=0;
			boolean bool = false;
			for(int i =0; i<n; i++) {
				arr[i] = sc.nextInt();
				
				//System.out.println(i + " "+arr[i]);
				
				if(temp[arr[i]] == 0) {
					temp[arr[i]] = 1;
				}
				else {
					temp[arr[i]] +=1;
				}
				if(temp[arr[i]]==3) {

					bool = true;
					freqvar = arr[i];
				}
			}
			if(!bool) {
				System.out.println(-1);
			}
			else
				System.out.println(freqvar);
			
			
    }
		sc.close();
	
	}
}
