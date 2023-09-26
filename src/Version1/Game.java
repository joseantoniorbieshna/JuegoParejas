package Version1;



public class Game {
	public static void main(String[] args) {
		TableroJugador tableroJugador = new TableroJugador();
		TableroOculto tableroOculto = new TableroOculto();
		boolean ganador=false;
		do{
			tableroOculto.mostrarTablero();
			if(CoupleParts.realizarJugada(tableroJugador.getTablero(),tableroOculto.getTablero()))
				ganador=CoupleParts.comprobarGanador(tableroJugador.getTablero());
		}while(!ganador);
	}	
} 
