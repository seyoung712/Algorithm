//★★★
package sort;
import java.util.Scanner;

public class sort_2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); //개수 입력
		int[] arr = new int[N]; //수를 입력받을 배열
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		//오름차순 정렬
		int tmp;
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i] > arr[j]) { //앞의 값이 크면 뒤로 보내기
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} //if
			} //for
		} //for
		
		//출력
		for(int c=0; c<N; c++) {
			System.out.println(arr[c]);
		}
		
	}//main
} //class
