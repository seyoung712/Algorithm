package If;

import java.util.Scanner;
import java.util.*;

public class LeapYear_2753 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		
		if( year%4==0 && (year%100!=0 || year%400==0) ) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}

	}

}
