//★
package If;

import java.util.Scanner;

public class Dice_2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		// 1. 모든 변수가 다를 경우
		if (a != b && b != c && a != c) {
			int max;
			// 만약 a > b 라면
			if (a > b) {
				// c > a > b 라면
				if (c > a) {
					max = c;
				}
				// a > (b, c)
				else {
					max = a;
				}
			}
			// b > a 라면
			else {
				// c > b > a 라면
				if (c > b) {
					max = c;
				}
				// b > (a, c)
				else {
					max = b;
				}
			}
			System.out.println(max * 100);
		}
		// 2. 두 개의 변수가 같을 경우
		else {
			// 3. 변수가 모두 같은 경우
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a가 b혹은 c랑만 같은 경우
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b가 c랑 같은 경우
				else {
					System.out.println(1000 + b * 100);
				}
			}
		}

		/*
		 * if(a == b && b == c) { System.out.println(10000+(a*1000)); } else if ( ((a ==
		 * b && b != c) || (a == c && b != c))) { System.out.println(1000+(a*100)); }
		 * else if (a != b && b == c) { System.out.println(1000+(b*100)); } else if (a
		 * != b && a != c && b != c) { if((a>b && b>c) || (a>b && c>b)) {
		 * System.out.println(a*100); } else if((b>a && a>c) || (b>a && c>a)) {
		 * System.out.println(b*100); } else { System.out.println(c*100); } }
		 */
	}

}
