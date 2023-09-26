package Version3;



public class Game {
	
	Tablero tablero = new Tablero();
	
	public void jugar() {
		boolean ganador = false;
		do {
			tablero.mostrarTablero();
			if (realizarJugada()) {
				ganador = tablero.estaTotalmenteDesvelado();
			}
		} while (!ganador);
	}
	
	private boolean realizarJugada() {
		Coordenada origen = pedirNuevaCoordenada();
		tablero.mostrarTablero();
		Coordenada destino = pedirNuevaCoordenada();
		
		boolean comprobacion = tablero.comprobarParejas(origen, destino);
		pausar(1);
		if (!comprobacion) {
			tablero.ocultarFichaEnCoordenada(origen);
			tablero.ocultarFichaEnCoordenada(destino);
		}
		tablero.mostrarTablero();
		return comprobacion;
	}

	private Coordenada pedirNuevaCoordenada() {
		Coordenada origen = new Coordenada();
		do {
			origen.pedirCoordenadaPorTecladoEntre(0,Tablero.SIZE);
		} while (!tablero.revelarFichaEnPosicion(origen));
		return origen;
	}

	private void pausar(int i) {
		try {
			new Thread().sleep(i * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}



	

	
	public static void main(String[] args) {
		new Game().jugar();
	}
}
