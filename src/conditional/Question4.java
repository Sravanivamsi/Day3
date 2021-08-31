package conditional;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m= sc.nextInt();
		int n= sc.nextInt();
		for(int i=m;i<=n;i++) {
		int k=i%10;
		int r=i/10;
		int sum=k+r;
		int prod=k*r;
		if((sum+prod==i)) {
			System.out.println(i);
		}
		}
	}

}
