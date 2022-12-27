package sort;
import java.util.Scanner;

public class representativeValue_2587 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int avg = 0; //평균값 변수
		int[] arr = new int[5];
		
		for(int i=0; i<5; i++) {
			arr[i] = in.nextInt(); //수를 입력받아
			avg += arr[i]; //누적
		}//for
		
		System.out.println(avg/5);//평균값 출력
		
		//정렬
		int tmp;
		for(int i=0; i<4; i++) {
			for(int j=i+1; j<=4; j++) {
				if(arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println(arr[2]); //중앙값 출력
		
		

	}//main
}//class
