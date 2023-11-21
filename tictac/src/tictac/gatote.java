
package tictac;

import java.awt.Color;
import javax.swing.*;

public class gatote{
//ATRIBUTOS--------------------------------------------------------------------------------------
            //Componentes del juego:
            boolean turno;
            Color color_boton;
            int[][] matriz_ganadora = new int[3][3];
            boolean juego_ganado;
            gatito[][] gran_matriz;

//Constructor-----------------------------------------------------------------------
    public gatote() {
        boolean juego_ganado = false;
        this.turno = true;
        this.color_boton = Color.RED;
        this.gran_matriz = new gatito[3][3];

        // Inicializar cada posición de la matriz con un nuevo objeto gatito
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                this.gran_matriz[i][j] = new gatito();
            }
        }
    }
    
//METODOS---------------------------------------------------------------------------- 
    
                    // Configurar cuadros dentro del gran gato:
                    public void setGatito(int fila, int columna, gatito cuadro) {
                        gran_matriz[fila][columna] = cuadro;
                    }
                    public gatito getGatito(int fila, int columna) {
                        return gran_matriz[fila][columna];
                    }



 //COORDENADAS: Cada que se pulse un boton, se completara un turno.
 public void coordenada(javax.swing.JButton button, int[][] matriz, int x, int y, int gany, int ganx) {
    if (juego_ganado == true){return;} //impide seguir jugando despues de ganar.
    if (matriz_ganadora[ganx][gany] != 0) {return;}//impide seguir jugando en una matriz victoriosa.
    
    //Caso de estar disponible el gato:
    if (matriz[x][y] == 0) {
        if (turno) {
            matriz[x][y] = 1;
            color_boton = Color.RED;
        } else {
            matriz[x][y] = 2;
            color_boton = Color.BLUE; 
        }
        button.setBackground(color_boton);
        turno = !turno;

        // Llamada de otros métodos.
        verificacion();
    }
}
}
    
    
    


