package test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class return_25501 {

	static int count; //의미???
	static String sentence;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //IOException 선언 필요
		
		for(int i=0; i<n; i++) {
			sentence=br.readLine();
			count=0;
			System.out.println(isPalindrome(0,sentence.length()-1)+" "+count);
		}//for

	}//main
	
	public static int isPalindrome(int r, int l) {
		count++;
		if(r>=l) { //왼쪽 인덱스 수와 오른쪽 인덱스 수가 같거나 크면
			return 1;//참
		} else if (sentence.charAt(r) != sentence.charAt(l)) {
			return 0;
		} else {
			return isPalindrome(r+1, l-1);
		}//if
		
	}//isPalindrome

}//return_25501
