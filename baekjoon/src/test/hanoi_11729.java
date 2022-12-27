//Q) �� �۾��� �����ϴµ� �ʿ��� �̵� ������ ����ϴ� ���α׷��� �ۼ��϶�. 
package test;
import java.util.Scanner;

public class hanoi_11729 {
	public static StringBuilder sb = new StringBuilder(); //StringBuilder : 1�� �̻��� ���ڿ����� ���� �� ���

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //������ �Է¹��� (N=���ݰ���)
		
		sb.append((int) (Math.pow(2,N)-1)).append('\n'); //?
		//Math.pow = ����
		//sb�� ��µǴ� �κ�
		
		Hanoi(N,1,2,3);
		System.out.println(sb); //StringBuilder�� ���ڿ� ���

	}
	
	public static void Hanoi(int N, int start, int mid, int to) {
		if (N==1){ // �̵��� ������ 1�����,
			sb.append(start + " " + to + '\n'); //����� (���, ����)
			return;
		}
		
		//A-> C�� �ű� ��
		//(1) N-1���� A���� B�� �̵� (start������ N-1���� ������ mid�� �ű�)
		Hanoi(N-1, start, to, mid); // start -> mid
		//(2) ���� ū ���� 1���� A���� C�� �̵� (start ������ N��° ������ to�� �ű��)
		sb.append(start + " " + to + '\n'); //���� ū ���ݸ� �̵� = �̵�Ƚ�� 1
		//(3) N-1���� B���� C�� �̵� (mid ������ N-1���� ������ to�� �ű�)
		Hanoi(N-1, mid, start, to); //mid -> to
	}

}
