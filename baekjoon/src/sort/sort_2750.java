//�ڡڡ�
package sort;
import java.util.Scanner;

public class sort_2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt(); //���� �Է�
		int[] arr = new int[N]; //���� �Է¹��� �迭
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		//�������� ����
		int tmp;
		for(int i=0; i<N-1; i++) {
			for(int j=i+1; j<N; j++) {
				if(arr[i] > arr[j]) { //���� ���� ũ�� �ڷ� ������
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} //if
			} //for
		} //for
		
		//���
		for(int c=0; c<N; c++) {
			System.out.println(arr[c]);
		}
		
	}//main
} //class
