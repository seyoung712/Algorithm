//★
package arrangement_1;
import java.util.Scanner;

public class OX_8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] input = new String[in.nextInt()]; // ?

		for (int i = 0; i < input.length; i++) { // 배열 길이만큼 문제 정답유무를 입력받음
			input[i] = in.next();
		}

		in.close();

		for (int i = 0; i < input.length; i++) { // 문제 개수만큼 반복
			int cnt = 0;
			int sum=0;
			
			for(int j=0; j<input[i].length(); j++) {
				if(input[i].charAt(j) == 'O') { //charAt는 String 문자열에서 해당 위치의 문자 하나를 가져오는 역할!!!
					cnt++; //연속 O가 나오면 +1
				} else {
					cnt=0; //아니면 초기화
				}
				sum += cnt;
			}//for
			
			//점수 출력
			System.out.println(sum);
			
		}//for

	}//main
}//class
