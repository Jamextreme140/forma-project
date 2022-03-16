package Unidad3;

public class Elipse extends forma {

	private int Rm;
	private int RM;
	public Elipse(int Rm, int RM, String nombre) {
		super("amarillo", 3, 9, "TX");
		this.Rm = Rm;
		this.RM = RM;
	}

	public Elipse() {
		this(0, 0, "");
	}
	
	public float Area() {
		return (float)(Math.PI * (RM * Rm));
	}

}
