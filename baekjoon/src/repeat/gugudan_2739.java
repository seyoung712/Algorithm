package repeat;
import java.util.Scanner;

public class gugudan_2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		for(int i=1; i<=9; i++) {
			int dap = N*i;
			System.out.println(N + " * " + i + " = " + dap);
		}

	}

}
