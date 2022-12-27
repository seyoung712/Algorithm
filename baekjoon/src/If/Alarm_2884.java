package If;

import java.util.Scanner;

public class Alarm_2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int H = in.nextInt();
		int M = in.nextInt();
		
		
		if(M<45) {
			H=H-1;
			M=60-(45-M);
			if(H<0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		} else {
			M=M-45;
			System.out.println(H + " " + M);
		}
		
	}
}
