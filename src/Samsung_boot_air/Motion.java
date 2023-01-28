package Samsung_boot_air;

import java.util.Random;

class Motion implements IMotion {
    private int[] obstacles = new int[3];
    private double distanceConstraint = 0.5;
    private double angleConstraint = 1;
    private Random rand = new Random();

    @Override
    public boolean move(double distance) {
        // Simuler un mouvement en utilisant la contrainte de distance
        boolean isMoved = (distance <= distanceConstraint);
        if (!isMoved) {
            // Simuler la détection d'un obstacle en utilisant un nombre aléatoire
            int obstacle = rand.nextInt(10);
            if (obstacle < 3) {
                obstacles[obstacle]++;
                return false;
            }
        }
        return true;
    }

    @Override
    public void rotate(double angle) {
        // Simuler une rotation en utilisant la contrainte d'angle
        if (angle > angleConstraint) {
            System.out.println("Angle de rotation trop grand, doit être inférieur à " + angleConstraint + " degrés.");
        }
    }

    public void scan() {
        System.out.println("Obstacles détectés : Mur=" + obstacles[0] + ", Meuble=" + obstacles[1] + ", Personne=" + obstacles[2]);
    }
}
