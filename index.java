package sammiedoingjava;

import java.util.*;
public class index {
	public static void main(String[] args) {
		System.out.println("The String is: Tops Technologies !");
		System.out.println("input index: ");
		Scanner Scan = new Scanner(System.in);
		int index = Scan.nextInt();
		Scan.close();
		
		String input = new String ("Tops Technologies!") ;
	
	if(index >= 0 && index < input.length()) {
			char characterAtIndex = input.charAt(index);
				System.out.println("character:" + characterAtIndex);
			}
		
		}
		
	}

