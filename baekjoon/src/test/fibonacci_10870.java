package test;
import java.util.Scanner;

public class fibonacci_10870 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //N : 입력받은 수
		
		System.out.println(fibonacci(N)); //결과값(N) 출력
	}
	
	static int fibonacci(int N) {
		if(N==0) return 0;
		if(N==1) return 1;
		return fibonacci(N-1) + fibonacci(N-2);
	}

}
