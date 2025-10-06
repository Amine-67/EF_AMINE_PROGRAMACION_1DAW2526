package Unidad2;

import java.util.Scanner;

public class CuentaBancaria {
/* Crea una clase CunetaBancaria con atributos titular y saldo.
 * Implementa los métodos ingresar(double) y retirar(double).
 * Prueba a ingresar y retirar dinero desde el main.
 */
 String titular;
 double saldo=0;
 
 // Constructor
 public void CuentaBancaria() {
	 titular="";
	 saldo=0;
	 }
 
 public void ingresar(double dinero) {
	 saldo = saldo + dinero ;
	 //saldo += dinero
 }

 public void retirar(double dinero) {
	 saldo = saldo - dinero;
	 //saldo -= dinero
 }
 
 public void mostrarSaldo() {
	 System.out.println("El saldo actual de la cuenta es: "+saldo);
 }
 
 
 public static void main(String[] args) {
	 
	 //Declaro un objeto de clase CuentaBancaria
	 //Estoy declarando el objeto "cuentaDeAmine" de la clase CunetaBancaria
	 CuentaBancaria cuentaDeAmine = new CuentaBancaria(); //El new llama al constructor
	 
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("Introduce la cantidad de dinero a ingresar: ");
	 double dinero = teclado.nextDouble();
	 
	 cuentaDeAmine.ingresar(dinero);
	 cuentaDeAmine.mostrarSaldo();
	 
	 // Pedir al usario, retirar dinero y mostrar 
	 System.out.println("Introduce la cantidad de dinero a retirar: ");
	 double saldo = teclado.nextDouble();
	 }
}
	 
	 
