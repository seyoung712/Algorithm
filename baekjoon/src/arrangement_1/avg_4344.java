//★
package arrangement_1;

import java.util.Scanner;

public class avg_4344 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c = scan.nextInt(); //테스트 케이스 개수
		int[] arr; //배열 선언
		
		for(int i=0; i<c; i++) {
			int N = scan.nextInt(); //학생 수 입력
			arr = new int[N]; //학생 수만큼 배열 크기 설정
			
			double sum=0; //성적 합 변수
			
			//성적 입력
			for(int j=0; j<N; j++) {
				int grade = scan.nextInt();
				arr[j] = grade; //배열에 성적을 넣고
				sum += grade; //누계
			}//for(j)
			
			double avg = (sum/N);
			double count = 0; //평균 넘는 학생 수 (연산을 위해 double로 선언)
			
			//평균이 넘는 학생 비율 계산
			for (int j=0; j<N; j++) {
				if(arr[j]>avg) { //점수가 평균을 넘는다면
					count++; //학생 수 +1
				}
			}//for(j)
			
			System.out.printf("%.3f%%\n",(count/N)*100); //★
			
		}//for(i)
		scan.close();
		
	}//main
}//class
