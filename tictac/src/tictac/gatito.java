
package tictac;
import java.awt.Color;

public class gatito {
    private int[][] matriz;
    private Color colorBoton;

    public gatito() {
        matriz = new int[3][3];
        colorBoton = Color.WHITE;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public Color getColorBoton() {
        return colorBoton;
    }
}
