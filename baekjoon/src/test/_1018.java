package test;
import java.util.Scanner;

public class _1018 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int M = in.nextInt();
			int cnt=0;
			
			
			String[][] arr = new String[N][M];
			
			//�迭 �Է�
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j]=in.next();
				} //for
				
			} //for
			
			//��
			for(int i=0; i<N; i++) {
				for(int j=0; j<M-1; j++) {
					if(arr[i][j]=="W") { //ù ��° ���ڰ� W�� ��
						if(arr[i][j+1]=="W") {  //������(j)�� W���
							cnt+=1;
							arr[i][j+1]="B";
						}
						while(i==0 && i<N-1) {
							if(arr[i+1][j]=="W") {  //������(i)�� W���
								cnt+=1;
								arr[i+1][j]="B";
							}
							break;
						}//while
					}else { //ù ��° ���ڰ� B�� ��
						if(arr[i][j+1]=="B") { //������(j)�� B���
							cnt+=1;
							arr[i][j+1]="W";
						}
						while(i==0 && i<N-1) { 
							if(arr[i+1][j]=="B") {  //������(i)�� B���
								cnt+=1;
								arr[i+1][j]="W";
							}
							break;
						}//while
					} //if
				} //for

			} //for
			System.out.println(cnt);
		}
	}//main

} //class
