//��
package arrangement_1;
import java.util.Scanner;

public class OX_8958 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String[] input = new String[in.nextInt()]; // ?

		for (int i = 0; i < input.length; i++) { // �迭 ���̸�ŭ ���� ���������� �Է¹���
			input[i] = in.next();
		}

		in.close();

		for (int i = 0; i < input.length; i++) { // ���� ������ŭ �ݺ�
			int cnt = 0;
			int sum=0;
			
			for(int j=0; j<input[i].length(); j++) {
				if(input[i].charAt(j) == 'O') { //charAt�� String ���ڿ����� �ش� ��ġ�� ���� �ϳ��� �������� ����!!!
					cnt++; //���� O�� ������ +1
				} else {
					cnt=0; //�ƴϸ� �ʱ�ȭ
				}
				sum += cnt;
			}//for
			
			//���� ���
			System.out.println(sum);
			
		}//for

	}//main
}//class
