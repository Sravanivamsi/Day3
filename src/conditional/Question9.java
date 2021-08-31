package conditional;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter n");
		int n= sc.nextInt();
		System.out.println("Enter m");
		int m = sc.nextInt();
		int  i=1;
		while(i<=m) {
			System.out.println(i+"*"+n+"="+n*i);
			i++;
		}
		
		// TODO Auto-generated method stub

	}

}
