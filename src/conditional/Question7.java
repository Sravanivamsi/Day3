package conditional;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter n");
		int n= sc.nextInt();
		int i=1;
		int count=0;
		int sum=0;
		int count1=0;
		while(i<=n) {
			System.out.println("enter number");
			int num = sc.nextInt();
			i++;
			if(num>0) {
				count = count+1;
				sum=sum+num;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println("number of positive numbers entered is"+count+"and the sum is"+sum);
	}
	}
