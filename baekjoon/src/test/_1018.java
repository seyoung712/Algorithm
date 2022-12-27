package test;
import java.util.Scanner;

public class _1018 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int N = in.nextInt();
			int M = in.nextInt();
			int cnt=0;
			
			
			String[][] arr = new String[N][M];
			
			//배열 입력
			for(int i=0; i<N; i++) {
				for(int j=0; j<M; j++) {
					arr[i][j]=in.next();
				} //for
				
			} //for
			
			//비교
			for(int i=0; i<N; i++) {
				for(int j=0; j<M-1; j++) {
					if(arr[i][j]=="W") { //첫 번째 문자가 W일 때
						if(arr[i][j+1]=="W") {  //다음열(j)이 W라면
							cnt+=1;
							arr[i][j+1]="B";
						}
						while(i==0 && i<N-1) {
							if(arr[i+1][j]=="W") {  //다음행(i)이 W라면
								cnt+=1;
								arr[i+1][j]="B";
							}
							break;
						}//while
					}else { //첫 번째 문자가 B일 때
						if(arr[i][j+1]=="B") { //다음열(j)이 B라면
							cnt+=1;
							arr[i][j+1]="W";
						}
						while(i==0 && i<N-1) { 
							if(arr[i+1][j]=="B") {  //다음행(i)이 B라면
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
