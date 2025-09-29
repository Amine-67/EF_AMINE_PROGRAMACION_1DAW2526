package Unidad1;

public class OPERADORES {
	public static void main(String[] args) {
		 int x = 15, y = 4;
		 // Operadores aritméticos
		 System.out.println("Suma: " + (x + y));
		 System.out.println("Resta: " + (x - y));
		 System.out.println("Multiplicación: " + (x * y));
		 System.out.println("División: " + (x / y));
		 System.out.println("Módulo: " + (x % y));
		// Relacionales
		 System.out.println("¿x > y? " + (x > y));
		 System.out.println("¿x == y? " + (x == y));
		 
		 int edad = 20;
		 boolean permiso = true;
		 System.out.println((edad >= 18) && permiso);
		 int z = 5;
		 System.out.println(++z); // 6 (se incrementa antes de usar)
		 System.out.println(z++); // 6 (se usa y luego se incrementa → ahora vale 7)
}
}
