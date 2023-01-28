package Samsung_boot_air;

public class TestScanFunction {

	public static void main(String[] args) {
		
		IMotion motion = new Motion(); // On suppose qu'il existe une classe Motion qui implémente l'interface IMotion
		RoomScanner scanner = new RoomScanner(motion);
		scanner.scan();
		int[][] grid = scanner.getGrid();
		// Affichage de la grille
		for (int i = 0; i <= 66; i++) {
		for (int j = 0; j <= 66; j++) {
		System.out.print(grid[i][j] + " ");
		}
		System.out.println();
		}
	}

}
