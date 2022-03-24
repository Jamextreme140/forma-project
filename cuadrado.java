package Unidad3;

public class cuadrado extends rectangulo {

	private float Lado;
	public cuadrado(String nombre, int X, int Y, float Lado) {
		super("CDR", 8, 8, 10, 10);
		this.Lado = Lado;
		
	}

	public cuadrado() {
		this("", 0, 0, 0);
	}
	
	public float Area() {
		return Lado * 2;
	}
	
	public float Perimetro() {
		return Lado + Lado;
	}
	
	public void Imprimir() {
		System.out.println("Este rectangulo tiene " + Lado + " de lado");
	}

}
