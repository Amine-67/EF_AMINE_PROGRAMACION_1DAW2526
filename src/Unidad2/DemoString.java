package Unidad2;

public class DemoString {

	public static void main(String[] args) {
	String s = " Hola Java ";
	System.out.println("Longitud: " +s.length());
	System.out.println("trim(quitando espacios al principio y al final)" +s.trim());
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.charAt(2));
	System.out.println(s.indexOf("Java"));
	System.out.println(s.lastIndexOf('a'));
	
	
	
	}
}
