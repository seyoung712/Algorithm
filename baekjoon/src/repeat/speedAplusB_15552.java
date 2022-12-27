//★
package repeat;
import java.io.*;
import java.util.StringTokenizer;

public class speedAplusB_15552 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //한 라인을 "읽어오기"
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //쓰기
		
		int T = Integer.parseInt(br.readLine()); //BufferedReader(br), 한 라인을 읽어와 "정수변환"
		StringTokenizer st; //BufferedReader는 한 라인을 읽기 때문에 StringTokenizer(st)를 통한 "공백 단위 데이터 가공"을 위한 선언
		int a, b; //쪼갠 문자열을 담을 정수변수 선언
		
		for(int i=0; i<T; i++) {
			st = new StringTokenizer(br.readLine()); //해당 줄 전체를 입력받는다. (br.readLine())
			a = Integer.parseInt(st.nextToken()); //읽어온 문자열을 StringTokenizer(st)를 통해 쪼개는 과정
			b = Integer.parseInt(st.nextToken());
			
			bw.write((a+b)+ "\n"); //A+B (write:읽어오기?)
		}
		br.close(); //BufferedReader 닫기
		
		bw.flush(); //남아있는 데이터 모두 출력 (버퍼를 비워준다)
		bw.close(); //BufferedWriter 닫기
		
		
		

	}

}
