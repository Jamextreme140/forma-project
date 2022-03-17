package Unidad3;
import java.util.Random;
import java.util.Scanner;
public class AppForma {

	public static String colores [] = {"Blanco", "Rojo", "Verde", "Azul", "Cafe", "Negro"};
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		Random r = new Random();
		System.out.print("Cuantas formas son: ");
		int nf = read.nextInt();
		forma vector [] = new forma[nf];
		int fig;
		
		for(int i = 0; i < nf; i++) {
			fig = r.nextInt(4);
			switch(fig) {
			case 0:
				vector[i] = new rectangulo(colores[r.nextInt(6)], r.nextInt(950), r.nextInt(700),
				        r.nextInt(200), r.nextInt(100));
				break;
			case 1:
				vector[i] = new Elipse(colores[r.nextInt(6)], r.nextInt(950), r.nextInt(700),
				        r.nextInt(200), r.nextInt(100));
				break;
			case 2:
				vector[i] = new cuadrado(colores[r.nextInt(6)], r.nextInt(950), r.nextInt(700));
				break;
			
			}
		}

	}

}
