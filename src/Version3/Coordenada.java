package Version3;

import java.util.Random;
import java.util.Scanner;

public class Coordenada {
	private Integer x;
	private Integer y;
	
	private boolean comprobarValor(int valor,int min,int max) {
		return valor >= min && valor < max;
	}
	
	private int pedirValorPorTecladoEntre(int min,int max) {
		Scanner leer = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.println("introduce un valor entre "+min+" y " + (max - 1));
			valor = leer.nextInt();
		} while (!comprobarValor(valor,min,max));
		return valor;
	}
	
	public void pedirCoordenadaPorTecladoEntre(int min,int max) {
		this.setX(this.pedirValorPorTecladoEntre(min, max));
		this.setY(this.pedirValorPorTecladoEntre(min, max));
	}
	
	public static Coordenada getAleatoriaConValoresMax(int valorMax) {
		Coordenada coordenada= new Coordenada() ;
		coordenada.setY(new Random().nextInt(valorMax)) ;
		coordenada.setX(new Random().nextInt(valorMax)) ;
		return coordenada;
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
