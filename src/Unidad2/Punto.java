package Unidad2;

public class Punto {

	int x;
	int y;
	
	public Punto() {
	x=0;
	y=0;
}
public Punto(int x, int y) {
	super();
	this.x= x;
	this.y= y;
}
  public void mostrarPunto() {
	System.out.println("Las cordenadas del punto son: ("+x+","+y+")");
  } 
	
	public static void main (String[] args) {
		Punto a = new Punto();
		Punto b = new Punto(3,4);
		Punto c = new Punto(8,5);
		
		a.mostrarPunto();
		b.mostrarPunto();
		c.mostrarPunto();
		
	}	
}
