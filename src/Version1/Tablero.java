package Version1;

public abstract class Tablero {
	private int[][] tablero;
	
	public void crearTablero() {
		// Los archivos no se reconocen bien siestan en el
		// default package por eso creamos el package Juego
		tablero = new int[Constantes.size][Constantes.size];
	}
	public abstract void rellenar();

	public int[][] getTablero() {
		return tablero;
	}
	
}
