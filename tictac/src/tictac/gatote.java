
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
            JLabel resultados;

//Constructor-----------------------------------------------------------------------
    public gatote() {
        boolean juego_ganado = false;
        this.turno = true;
        this.color_boton = Color.RED;
        this.gran_matriz = new gatito[3][3];
        resultados = new JLabel("-JUGANDO-");

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
public void coordenada(javax.swing.JButton button, gatito cuadro, int x, int y, int gany, int ganx) {
    if (juego_ganado) {
        return; // Impide seguir jugando después de ganar.
    }
    if (matriz_ganadora[ganx][gany] != 0) {
        return; // Impide seguir jugando en una matriz victoriosa.
    }

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

        // Cambio de turno para el siguiente movimiento
        if (!juego_ganado) {
            // Aquí aplicamos la lógica que mencionaste
            int siguienteFila = -1;
            int siguienteColumna = -1;

            // Si X jugó en el cuadro 5 en la posición (1,0)
            if (x == 1 && y == 0) {
                // O debe jugar en el cuadro 4 en la posición (0,1)
                siguienteFila = 0;
                siguienteColumna = 1;
            }
            // Si O jugó en el cuadro 4 en la posición (0,1)
            else if (x == 0 && y == 1) {
                // X debe jugar en el cuadro 2 en la posición (1,0)
                siguienteFila = 1;
                siguienteColumna = 0;
            }

            // Realizar el movimiento automáticamente en el siguiente cuadro
            if (siguienteFila != -1 && siguienteColumna != -1) {
                gatito siguienteCuadro = gran_matriz[siguienteFila][siguienteColumna];
                coordenada(null, siguienteCuadro, 1, 1, siguienteFila, siguienteColumna);
            }
        }
    }
}



    // Método de verificación
// Método de verificación
public void verificacion() {
    for (int i = 0; i < gran_matriz.length; i++) {
        for (int j = 0; j < gran_matriz[i].length; j++) {
            if (matriz_ganadora[i][j] == 0 && verifica_ganador(gran_matriz[i][j].getMatriz())) {
                matriz_ganadora[i][j] = turno ? 2 : 1;
                System.out.println("Jugador " + (turno ? "O" : "X") + " ganador en: fila " + (i + 1) + " / columna: " + (j + 1));
            }
        }
    }

    if (verifica_ganador(matriz_ganadora)) {
        // Cambiar el texto del JLabel
        resultados.setText((turno ? "O" : "X") + " Gano la partida");
        juego_ganado = true;
        return;
    } else {
        // Si no hay ganador, puedes cambiar el texto a "-JUGANDO-"
        resultados.setText("-JUGANDO-");
    }
}

    // Método privado de verificación de ganador en una matriz
    private boolean verifica_ganador(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) {
                return true;
            }
            if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0) {
                return true;
            }
        }
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
            return true;
        }
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) {
            return true;
        }
        return false;
    }
    
    
    
    
    
}
    
    
    


