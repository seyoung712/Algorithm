package in_out;
import java.util.Scanner;

public class mul_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a*(b%10)); //b의 세번째 자리
		System.out.println(a*((b%100)/10)); //b의 두번째 자리
		System.out.println(a*(b/100)); //b의 첫번째 자리
		System.out.println(a*b);
	}

}
