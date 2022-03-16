package Unidad3;

public class circulo extends Elipse {

	private int R;
	public circulo(int R, int D, String nombre) {
		this.R = R;
	}

	public circulo() {
		this(0, 0, "");
	}
	
	public float Area() {
		return (float)(Math.PI * (Math.pow(R, 2)));
	}
	
	public float Diametro() {
		return 2*R;
	}

}
