package in_out;
import java.util.Scanner;

public class mul_2588 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a*(b%10)); //b�� ����° �ڸ�
		System.out.println(a*((b%100)/10)); //b�� �ι�° �ڸ�
		System.out.println(a*(b/100)); //b�� ù��° �ڸ�
		System.out.println(a*b);
	}

}
