package If;

import java.util.Scanner;

public class Oven_2525 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt(); //���� �ð� (��)
		int B = in.nextInt(); //���� �ð� (��)
		
		int C = in.nextInt(); //�ҿ� �ð�
		
		int min = 60*A + B; //������ ȯ��
		min = min + C; //ȯ���� ���� �ҿ� �ð��� ����
		
		int hour = (min/60) % 24; //?..
		int minute = min % 60;
		
		System.out.println(hour + " " + minute);
	}

}
