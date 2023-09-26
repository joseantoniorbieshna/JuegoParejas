package Version1;

import java.util.Random;

public class TableroJugador extends Tablero{
	
	public TableroJugador() {
		crearTablero();
		rellenar();
		intercambiarPosiciones();
	}
	
	public void rellenar() {
		for (int i = 0, valor = 0; i < getTablero().length; i++) {
			for (int j = 0; j < getTablero().length - 1; j += 2, valor++) {
				getTablero()[i][j] = valor;
				getTablero()[i][j + 1] = valor;
			}
		}
	}
	public void intercambiarPosicion( int[] origen, int[] destino) {
		int intercambio = getTablero()[origen[0]][origen[1]];
		getTablero()[origen[0]][origen[1]] = getTablero()[destino[0]][destino[1]];
		getTablero()[destino[0]][destino[1]] = intercambio;
	}
	public void intercambiarPosiciones() {
		// creamos las coordenadas de origen y destino
		int[] origen = new int[2], destino = new int[2];
		int intercambios = (int) Math.pow(Constantes.size, 3);
		for (int i = 0; i < intercambios; i++) {
			realizarSorteo(origen);
			realizarSorteo(destino);
			intercambiarPosicion(origen, destino);
		}
	}
	public static void realizarSorteo(int[] coordenada) {
		for (int i = 0; i < coordenada.length; i++) {
			coordenada[i] = new Random().nextInt(Constantes.size);
		}
	}
	
	
	
	
}
