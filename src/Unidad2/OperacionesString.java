package Unidad2;

import java.util.Scanner;

public class OperacionesString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		System.out.println("La longitud de la frase es : "+frase.length());
		System.out.println("La primera letra es: "+frase.charAt(0));
		System.out.println("La ultima letra es: "+frase.charAt(frase.length()-1));
		
		System.out.println("La Frase en mayúsculas es: "+frase.toUpperCase());
		
		
		
	}
	
	

}
