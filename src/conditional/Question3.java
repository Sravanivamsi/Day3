package conditional;
import java.util.Scanner;
public class Question3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k= n%10;
		int m =n/10;
		int r = m/10;
		int s = m%10;
		int sum =k+r;
		if(sum==s) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
