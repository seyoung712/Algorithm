package repeat;
import java.util.Scanner;

public class lessThanX_10871 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int X = in.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		} //수 입력 받음

		
		for(int i=0; i<N; i++) {
			if(arr[i]<X) { //작은 수 찾아내기
				System.out.print(arr[i] + " "); //★
			}
		}
		

	}

}
