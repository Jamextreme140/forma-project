package Unidad3;

public abstract class forma {
	private String color;
	private int x;
	private int y;
	private String nombre;
	
	public forma(String color, int x, int y, String nombre) {
		this.color = color;
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}
	
	public forma() {
		this("", 0, 0, "");
	}
	
	public void Imprimir(){
		System.out.println("Esto es una forma " + nombre + ", con " + x + " y " + y + " de medidas");
	}
	
	public abstract float Perimetro();
	
	public abstract float Area();

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void MoverForma(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
