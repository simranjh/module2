package sammiedoingjava;

import java.util.Scanner;

public class concatenate {
	public static void main(String[] args) {
		String StringOne = "Hello";
		System.out.println("second word ?: ");
		Scanner Scan = new Scanner (System.in);
		String StringTwo = Scan.next();
	 
		System.out.println("concatenated: " + StringOne +" " + StringTwo);
	
	}
}
