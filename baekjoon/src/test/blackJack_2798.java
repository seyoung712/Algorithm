package test;
import java.util.Scanner;

public class blackJack_2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //입력받을 수의 개수
		int M = scan.nextInt(); //최대 수
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = search(arr,N,M);
		System.out.println(result);
		
	}//main
	
	static int search(int[] arr, int N, int M) {
		int result=0;
		
		for(int i=0; i<=N-2; i++) { //첫번째 카드는 N-2만 순회
			for(int j=i+1; j<=N-1; j++) { //두번째 카드는 첫번째 다음부터 N-1까지 순회
				for(int k=j+1; k<=N; k++) { //세번째 카드는 두번째 다음부터 N까지 순회
					int tmp = arr[i] + arr[j] + arr[k]; //세 개 카드 합
					
					if (tmp==M) //M(최대 수)와 세 카드의 합이 같다면 리턴, 종료
						return tmp;
					
					if(result<tmp && tmp<M) //세 카드 합이 이전 합보다 크면서 M보다 작을 경우 result 갱신
						result=tmp;
						
				} //for
			} //for
		} //for
		return result; //모든 순회를 마치면 result 리턴
	}//search
		

}//blackJack_2798
