package Version2;



public class Controler {
	/**
	 * Comprueba si todas las casillas estan ocultas
	 * 
	 * @param ocultas
	 * @return
	 */
	public boolean comprobarGanador(Ficha[][] tablero) {
		boolean resultado = true;
		for (int i = 0; i < tablero.length && resultado; i++) {
			for (int j = 0; j < tablero.length && resultado; j++) {
				if (tablero[i][j].isOculta())
					resultado = false;
			}
		}
		return resultado;
	}

	/**
	 * controla la jugada actual
	 * 
	 * @param tablero
	 * @param ocultas
	 * @return
	 */
	public boolean realizarJugada(Tablero tablero) {
		Coordenada origen = new Coordenada();
		do{
			origen.pedirCoordenada();
		}while(!tablero.revelarPosicion(origen));
		
		tablero.mostrarTablero();
		Coordenada destino = new Coordenada();
		do{
			destino.pedirCoordenada();
		}while(!tablero.revelarPosicion(destino));
		tablero.mostrarTablero();
		
		boolean comprobacion = tablero.comprobarParejas(origen, destino);
		pausar(1);
		if (!comprobacion) {
			tablero.ocultarFichaEnCoordenada(origen);
			tablero.ocultarFichaEnCoordenada(destino);
		}
		tablero.mostrarTablero();
		return comprobacion;
	}
	
	public void pausar(int i) {
		try {
			new Thread().sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



}
