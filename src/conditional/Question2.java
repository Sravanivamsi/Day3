package conditional;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int i=0;
		int c=0;
		int s=0;
		do {
			c++;
			int a = sc.nextInt();
			s=s+a;
			i++;
		}
		while(s<n);
		{
			System.out.println("the number of turns is:"+c);
			
		}
	}

}
