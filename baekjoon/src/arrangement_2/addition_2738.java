//��
package arrangement_2;

import java.util.Scanner;

public class addition_2738 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Byte N = in.nextByte();
		Byte M = in.nextByte();

		//�迭 ����
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		//ù ��° �迭 ä���
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {//������ ä��
				A[i][j] = in.nextByte();
			}
		}
		
		//�� ��° �迭 ä���
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {//������ ä��
				B[i][j] = in.nextByte();
			}
		}
		
		// �� �迭 ������ �ε��� �� �� ���
        for(int i = 0 ; i < N ; i++) {
             for (int j = 0 ; j < M ; j++) {
                System.out.print(A[i][j]+B[i][j]+" ");
                if(j == M-1) //�� ������ ���� �ٹٲ�
                    System.out.println();
             }
         }

	}

}
