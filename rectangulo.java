package Unidad3;

public class rectangulo extends forma {

	private int Lm;
	private int LM;
	public rectangulo(String nombre,int x, int y, int Lm, int LM) {
		super("rojo", 4, 8, "RCT");
		this.Lm = Lm;
		this.LM = LM;
	}

	public rectangulo() {
		this("", 0, 0, 0, 0);
	}
	
	public float Area() {
		return Lm * LM;
	}
	
	public int Perimetro() {
		return Lm*2 + LM*2;
	}
	
	public void CambiarTamaño(float Escala) {
		LM *= Escala;
		Lm *= Escala;
	}
	
	public void Imprimir() {
		System.out.println("Este rectangulo tiene " + Lm + " de lado y " + LM + " de base");
	}
	
	
	

}
