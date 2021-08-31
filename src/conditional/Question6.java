package conditional;
import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		int i=1;
		int sum=0;
		while(i<=n) {
			System.out.println("enter a number");
			int num = sc.nextInt();
			i++;
			sum= sum+num;
		}
		System.out.println("the sum is"+sum);
			
		}

	}

