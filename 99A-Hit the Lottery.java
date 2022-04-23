package Practice;
//import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Math;
public class ProblemA {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int rem = sc.nextInt(), cnt=0;
	//denominations given are 100, 20, 10, 5, 1
	//we'll take out the remainder of each of the divisions and further..
	//..till we hit 1 and then we'll store the the remainder inside the count
	if(rem>=100) {
		cnt = rem/100;
		rem = rem%100;
	}
	if(rem>=20) {
		cnt += rem/20;
		rem%=20;
	}
	if(rem>=10) {
		cnt += rem/10;
		rem%=10;
	}
	if(rem>=5) {
		cnt += rem/5;
		rem%=5;
	}
	if(rem>=1) {
		cnt += rem/1;
		rem%=1;
	}

	System.out.println(cnt);
	sc.close();	
	}
	
}
