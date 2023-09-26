package Version2;



public class Game {
	public static void main(String[] args) {
		Controler controler = new Controler();
		Tablero tableroJugador = new Tablero();
		boolean ganador=false;
		do{
			tableroJugador.mostrarTablero();
			if(controler.realizarJugada(tableroJugador)){
				ganador=controler.comprobarGanador(tableroJugador.getTablero());
			}
		}while(!ganador);
	}
} 
