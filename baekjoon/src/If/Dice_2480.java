//��
package If;

import java.util.Scanner;

public class Dice_2480 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		// 1. ��� ������ �ٸ� ���
		if (a != b && b != c && a != c) {
			int max;
			// ���� a > b ���
			if (a > b) {
				// c > a > b ���
				if (c > a) {
					max = c;
				}
				// a > (b, c)
				else {
					max = a;
				}
			}
			// b > a ���
			else {
				// c > b > a ���
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
		// 2. �� ���� ������ ���� ���
		else {
			// 3. ������ ��� ���� ���
			if (a == b && a == c) {
				System.out.println(10000 + a * 1000);
			} else {
				// a�� bȤ�� c���� ���� ���
				if (a == b || a == c) {
					System.out.println(1000 + a * 100);
				}
				// b�� c�� ���� ���
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
