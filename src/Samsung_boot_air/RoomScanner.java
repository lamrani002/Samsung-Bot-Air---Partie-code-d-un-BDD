package Samsung_boot_air;

public class RoomScanner {
	
	 private int[][] grid = new int[66][66];
	    private IMotion motion;
	    
	    public RoomScanner(IMotion motion) {
	        this.motion = motion;
	        // Initialisation de la grille
	        for (int i = 0; i < 66; i++) {
	            for (int j = 0; j < 66; j++) {
	                if (i == 0 || i == 65 || j == 0 || j == 65) {
	                    grid[i][j] = -1;
	                } else {
	                    grid[i][j] = 0;
	                }
	            }
	        }
	        grid[1][1] = 1;
	    }
	    
	    public void scan() {
	        int x = 1, y = 1;
	        for (int i = 0; i < 66; i++) {
	            // Détection des obstacles
	            if (motion.move(40)) {
	                x++;
	                grid[x][y] = 1;
	            } else {
	                grid[x][y] = -1;
	                motion.rotate(90);
	                y++;
	                i--;
	            }
	        }
	    }
	    
	    public int[][] getGrid() {
	        return grid;
	    }
}
