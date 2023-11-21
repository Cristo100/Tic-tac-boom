
package tictac;

import java.awt.Color;

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
    
//Metodos---------------------------------------------------------------------------- 
    // Configurar cuadros dentro del gran gato:
    public void setGatito(int fila, int columna, gatito cuadro) {
        gran_matriz[fila][columna] = cuadro;
    }
    public gatito getGatito(int fila, int columna) {
        return gran_matriz[fila][columna];
    }

//VERIFICACIONES:
   
    public void verificacion() {
        for (int i = 0; i < gran_matriz.length; i++) {
            for (int j = 0; j < gran_matriz[i].length; j++) {
                if (matriz_ganadora[i][j] == 0 && verifica_ganador(gran_matriz[i][j])) {
                    matriz_ganadora[i][j] = turno ? 2 : 1;
                    System.out.println("Jugador " + (turno ? "O" : "X") + " ganador en: fila " + (i + 1) + " / columna: " + (j + 1));
                }
            }
        }
        if (verifica_ganador(matriz_ganadora)) {
            // resultados.setText((turno ? "O" : "X") + " Gano la partida");
            // juego_ganado = true;
            System.out.println((turno ? "O" : "X") + " Gano la partida");
        }
    }

 //COORDENADAS: Cada que se pulse un boton, se completara un turno.
public void coordenada(javax.swing.JButton button, gatito cuadro, int x, int y, int gany, int ganx) {
    if (juego_ganado) {return;} // Impide seguir jugando después de ganar.
    if (matriz_ganadora[ganx][gany] != 0) {return;} // Impide seguir jugando en una matriz victoriosa.

    // Caso de estar disponible el gato:
    int[][] matriz = cuadro.getMatriz();
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

    // Método auxiliar para verificar ganador en una matriz
    private boolean verifica_ganador(gatito cuadro) {
        int[][] matriz = cuadro.getMatriz();

        for (int i = 0; i < 3; i++) {
          // Verificar filas y columnas
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) {
                return true;}
            if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0) {
                return true;}
        }// Verificar diagonales
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
            return true;}
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) {
            return true;}
        return false;
    }

    private boolean verifica_ganador(int[][] matriz) {
        // Método de verificación del ganador en el juego global
        // Puedes implementarlo de acuerdo a tus necesidades
        return false;
    }
    
    
    
}

