package conditional;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		while(b<=a) {
			System.out.println(a);
			a--;
		}
	while(b>=a) {
		System.out.println(a);
		a++;
	}

	}

}
