package Version2;

import java.util.Scanner;

public class Coordenada {
	private Integer x;
	private Integer y;
	

	private int pedirValor() {
		Scanner leer = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.println("introduce un valor entre 0 y " + (Tablero.SIZE - 1));
			valor = leer.nextInt();
		} while (!comprobarValor(valor));
		return valor;
	}
	
	public void pedirCoordenada() {
		this.setX(this.pedirValor());
		this.setY(this.pedirValor());
	}
	
	private static boolean comprobarValor(int valor) {
		return valor >= 0 && valor < Tablero.SIZE;
	}
	

	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
}
