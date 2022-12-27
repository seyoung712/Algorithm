package repeat;
import java.util.Scanner;

public class AplusB_10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		int[] arr = new int[T];
		
		for(int i=1; i<=T; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			
			System.out.println(a+b);
		}

	}

}
