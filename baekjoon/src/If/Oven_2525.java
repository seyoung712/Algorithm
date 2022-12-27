package If;

import java.util.Scanner;

public class Oven_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //현재 시각 (시)
		int B = in.nextInt(); //현재 시각 (분)
		
		int C = in.nextInt(); //소요 시간
		
		int min = 60*A + B; //분으로 환산
		min = min + C; //환산한 값에 소요 시각을 더함
		
		int hour = (min/60) % 24; //?..
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}

}
