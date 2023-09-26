package Version1;

public class TableroOculto extends Tablero {
	public TableroOculto() {
		crearTablero();
		rellenar();
	}
	public void rellenar() {
		for (int i = 0; i < getTablero().length; i++) {
			for (int j = 0; j < getTablero().length; j++) {
				getTablero()[i][j] = -1;
			}
		}
	}
	public void mostrarTablero() {
		int[][] matriz = getTablero();
		System.out.print("   ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("   " + i + " ");
		}
		System.out.println();
		System.out.print("   ");
		System.out.print("╔");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("�?�?�?�?");
			if (i != matriz.length - 1)
				System.out.print("╦");
		}
		System.out.println("╗");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print("  " + i);
			System.out.print("║ ");
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 10 && matriz[i][j] > -1)
					System.out.print(" ");
				if (matriz[i][j] == -1)
					System.out.print("X ");
				else
					System.out.print(matriz[i][j]);
				System.out.print(" ║ ");
			}
			System.out.println();
			if (i != matriz.length - 1) {
				System.out.print("   ");
				System.out.print("╠");
				for (int j = 0; j < matriz.length; j++) {
					System.out.print("�?�?�?�?");
					if (j != matriz.length - 1)
						System.out.print("╬");
				}
				System.out.println("╣");
			} else {
				System.out.print("   ");
				System.out.print("╚");
				for (int h = 0; h < matriz.length; h++) {
					System.out.print("�?�?�?�?");
					if (h != matriz.length - 1)
						System.out.print("╩");
				}
				System.out.println("�?");
			}
		}
	}
}
