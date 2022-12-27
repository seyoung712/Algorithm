//★
package arrangement_2;

import java.util.Scanner;

public class addition_2738 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Byte N = in.nextByte();
		Byte M = in.nextByte();

		//배열 생성
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		//첫 번째 배열 채우기
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {//열먼저 채움
				A[i][j] = in.nextByte();
			}
		}
		
		//두 번째 배열 채우기
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {//열먼저 채움
				B[i][j] = in.nextByte();
			}
		}
		
		// 두 배열 각각의 인덱스 값 합 출력
        for(int i = 0 ; i < N ; i++) {
             for (int j = 0 ; j < M ; j++) {
                System.out.print(A[i][j]+B[i][j]+" ");
                if(j == M-1) //열 끝까지 오면 줄바꿈
                    System.out.println();
             }
         }

	}

}
