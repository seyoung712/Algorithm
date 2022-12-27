package If;

import java.util.Scanner;

public class TestGrade_9498 {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			int grade = in.nextInt();
			
			if(grade>=90) {
				System.out.println("A");
			}else if (grade>=80) {
				System.out.println("B");
			}else if(grade>=70) {
				System.out.println("C");
			}else if(grade>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");
			}
		}
	}

}
