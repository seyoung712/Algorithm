//��
package repeat;
import java.io.*;
import java.util.StringTokenizer;

public class speedAplusB_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //�� ������ "�о����"
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //����
		
		int T = Integer.parseInt(br.readLine()); //BufferedReader(br), �� ������ �о�� "������ȯ"
		StringTokenizer st; //BufferedReader�� �� ������ �б� ������ StringTokenizer(st)�� ���� "���� ���� ������ ����"�� ���� ����
		int a, b; //�ɰ� ���ڿ��� ���� �������� ����
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()); //�ش� �� ��ü�� �Է¹޴´�. (br.readLine())
			a = Integer.parseInt(st.nextToken()); //�о�� ���ڿ��� StringTokenizer(st)�� ���� �ɰ��� ����
			b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b)+ "\n"); //A+B (write:�о����?)
		}
		br.close(); //BufferedReader �ݱ�
		
		bw.flush(); //�����ִ� ������ ��� ��� (���۸� ����ش�)
		bw.close(); //BufferedWriter �ݱ�
		
		
		

	}

}
