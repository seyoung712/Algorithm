package test;
import java.util.Scanner;

public class blackJack_2798 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt(); //�Է¹��� ���� ����
		int M = scan.nextInt(); //�ִ� ��
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int result = search(arr,N,M);
		System.out.println(result);
		
	}//main
	
	static int search(int[] arr, int N, int M) {
		int result=0;
		
		for(int i=0; i<=N-2; i++) { //ù��° ī��� N-2�� ��ȸ
			for(int j=i+1; j<=N-1; j++) { //�ι�° ī��� ù��° �������� N-1���� ��ȸ
				for(int k=j+1; k<=N; k++) { //����° ī��� �ι�° �������� N���� ��ȸ
					int tmp = arr[i] + arr[j] + arr[k]; //�� �� ī�� ��
					
					if (tmp==M) //M(�ִ� ��)�� �� ī���� ���� ���ٸ� ����, ����
						return tmp;
					
					if(result<tmp && tmp<M) //�� ī�� ���� ���� �պ��� ũ�鼭 M���� ���� ��� result ����
						result=tmp;
						
				} //for
			} //for
		} //for
		return result; //��� ��ȸ�� ��ġ�� result ����
	}//search
		

}//blackJack_2798
