package sammiedoingjava;

import java.util.Scanner;

public class compare {
	public static void main(String[] args) {
		String str1 = "c";
		
		Scanner Scan = new Scanner (System.in);
		String str2 = Scan.next(); 
		
		if (str1.equals(str2)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
