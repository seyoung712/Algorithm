package test;
import java.util.Scanner;

public class fibonacci_10870 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //N : �Է¹��� ��
		
		System.out.println(fibonacci(N)); //�����(N) ���
	}
	
	static int fibonacci(int N) {
		if(N==0) return 0;
		if(N==1) return 1;
		return fibonacci(N-1) + fibonacci(N-2);
	}

}
