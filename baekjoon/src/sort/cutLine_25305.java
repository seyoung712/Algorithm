package sort;
import java.util.Scanner;

public class cutLine_25305 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//�Է�
		int N = in.nextInt();
		int k = in.nextInt();
		
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = in.nextInt();
		}
		
		//�������� ����
		int tmp;
		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {
				if (arr[i] > arr[j]) { // ���� ���� ũ�� �ڷ� ������
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				} // if
			} // for
		} // for
		
		
		//���
		System.out.println(arr[k]);
		
	}

}
