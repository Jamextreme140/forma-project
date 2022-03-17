package Unidad3;

public class Elipse extends forma {

	private float Rm;
	private float RM;
	public Elipse(String color, int x, int y, float Rm, float RM) {
		super(color, 3, 9, "TX");
		super.setNombre("EPS");
		this.Rm = Rm;
		this.RM = RM;
	}

	public Elipse() {
		this("", 0, 0, 0, 0);
	}
	
	public float Area() {
		return (float)(Math.PI * (RM * Rm));
	}

}
