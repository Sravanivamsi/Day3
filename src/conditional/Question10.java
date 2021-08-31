package conditional;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	int count =0;
	System.out.println("enter the nu");
	int n = sc.nextInt();
	while(n!=0) {
		if(n%8==0) {
			count++;
		}
		else {
			System.out.println(count);
		}
	}
		
	}
}