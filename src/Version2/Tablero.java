package Version2;

import java.util.Random;

public class Tablero {
	
	private Ficha[][] tablero;
	public static final int SIZE=4;
	
	public void crearTablero() {
		// Los archivos no se reconocen bien siestan en el
		// default package por eso creamos el package Juego
		tablero = new Ficha[SIZE][SIZE];
	}

	
	public Tablero() {
		crearTablero();
		rellenar();
		intercambiarPosiciones();
	}
	
	public void rellenar() {
		for (int i = 0, valor = 0; i < getTablero().length; i++) {
			for (int j = 0; j < getTablero().length - 1; j += 2, valor++) {
				getTablero()[i][j] = new Ficha(valor);
				getTablero()[i][j + 1] = new Ficha(valor);
			}
		}
	}
	
	public void intercambiarPosiciones() {
		// creamos las coordenadas de origen y destino
		int intercambios = (int) Math.pow(SIZE, 3);
		for (int i = 0; i < intercambios; i++) {
			Ficha fichaOrigen = getFichaInCoordenada(getCoordenadaSorteo());
			Ficha fichaDestino = getFichaInCoordenada(getCoordenadaSorteo());
			fichaOrigen.intercambiarValores(fichaDestino);
		}
	}
	public static Coordenada getCoordenadaSorteo() {
		Coordenada coordenada= new Coordenada() ;
		coordenada.setY(new Random().nextInt(SIZE)) ;
		coordenada.setX(new Random().nextInt(SIZE)) ;
		return coordenada;
	}
	public boolean revelarPosicion(Coordenada cord) {
		boolean retorno = false;
		Ficha ficha= getFichaInCoordenada(cord);
		if (ficha.isOculta()) {
			ficha.revelar();
			retorno = true;
		}
		return retorno;
	}
	
	private Ficha getFichaInCoordenada(Coordenada coordenada) {
		return tablero[coordenada.getY()][coordenada.getX()];
	}

	public boolean comprobarParejas(Coordenada origen,Coordenada destino) {
		return getFichaInCoordenada(origen).getValor() == getFichaInCoordenada(destino).getValor();
	}
	
	public void ocultarFichaEnCoordenada(Coordenada coordenada) {
		getFichaInCoordenada(coordenada).ocultar();
	}

	public Ficha[][] getTablero() {
		return tablero;
	}
	
	public void mostrarTablero() {
		System.out.print("   ");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("   " + i + " ");
		}
		System.out.println();
		System.out.print("   ");
		System.out.print("╔");
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("�?�?�?�?");
			if (i != tablero.length - 1)
				System.out.print("╦");
		}
		System.out.println("╗");
		
		for (int i = 0; i < tablero.length; i++) {
			System.out.print("  " + i);
			System.out.print("║ ");
			for (int j = 0; j < tablero[i].length; j++) {
				if (tablero[i][j].getValor() < 10 && tablero[i][j].getValor() > -1)
					System.out.print(" ");
				if (tablero[i][j].isOculta())
					System.out.print("X ");
				else
					System.out.print(tablero[i][j].getValor());
				System.out.print(" ║ ");
			}
			System.out.println();
			if (i != tablero.length - 1) {
				System.out.print("   ");
				System.out.print("╠");
				for (int j = 0; j < tablero.length; j++) {
					System.out.print("�?�?�?�?");
					if (j != tablero.length - 1)
						System.out.print("╬");
				}
				System.out.println("╣");
			} else {
				System.out.print("   ");
				System.out.print("╚");
				for (int h = 0; h < tablero.length; h++) {
					System.out.print("�?�?�?�?");
					if (h != tablero.length - 1)
						System.out.print("╩");
				}
				System.out.println("�?");
			}
		}
	}
	
	
}
