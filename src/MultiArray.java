import java.util.Random;
public class MultiArray {

    private int[][] tab;

    public MultiArray(int n, int m) {
        tab = new int[n][m];
        randomize();
    }

    public void randomize() {
        Random rand = new Random();
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = rand.nextInt(100);
            }
        }
    }
    public int findMin() {
        int minValue = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] < minValue) {
                    minValue = tab[i][j];
                }
            }
        }
        return minValue;
    }
    public int findMax() {
        int maxValue = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (tab[i][j] > maxValue) {
                    maxValue = tab[i][j];
                }
            }
        }
        return maxValue;
    }
    public void print() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println();
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
        }
        System.out.println();
    }
}
