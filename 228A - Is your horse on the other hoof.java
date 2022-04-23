package Practice;
//import java.util.Arrays;
import java.util.Scanner;
//import java.lang.Math;
public class ProblemA {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[] = new int[4], cnt =0;
	for(int i= 0; i<4; i++) {
		if(i ==1) {
			a[i] = sc.nextInt();
			if(a[1] == a[0]) {
				cnt++;
			}
		}
		else if(i==2) {
			a[i] = sc.nextInt();
			if(a[2] == a[1]||a[2] == a[0]) {
				cnt++;
			}

		}
		else if(i==3) {
			a[i] = sc.nextInt();
			if(a[3] == a[2]||a[3] == a[1]||a[3] == a[0]) {
				cnt++;
			}
		}
		else {
			a[i] = sc.nextInt();
		}
	}
	System.out.println(cnt);
	sc.close();	
	}	
}
