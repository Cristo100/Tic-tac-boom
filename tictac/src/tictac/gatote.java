
package tictac;

import java.awt.Color;

public class gatote{
//ATRIBUTOS
            boolean turno;
            Color color_boton;
            int[][] matriz_ganadora = new int[3][3];
            boolean juego_ganado;
            gatito[][] gran_matriz;

//Constructor
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
    
    
    
//METODOS
                    public void setGatito(int fila, int columna, gatito cuadro) {
                        gran_matriz[fila][columna] = cuadro;
                    }
                    public gatito getGatito(int fila, int columna) {
                        return gran_matriz[fila][columna];
                    }



 //COORDENADAS: Cada que se pulse un boton, se completara un turno.
public void coordenada(int[][] matriz, int x, int y, int gany, int ganx, javax.swing.JLabel resultados) {
    if (juego_ganado == true){return;} //impide seguir jugando despues de ganar.
    if (matriz_ganadora[ganx][gany] != 0) {return;}//impide seguir jugando en una matriz victoriosa.
    
    //Caso de estar disponible el gato:
    if (matriz[x][y] == 0) {
        if (turno) {
            matriz[x][y] = 1;
        } else {
            matriz[x][y] = 2;
        }
        turno = !turno;
        verificacion(resultados);
    }
}
 


 public void verificacion(javax.swing.JLabel resultados) {
    for (int i = 0; i < gran_matriz.length; i++) {                          //Verificacion de ganador en solo un cuadro (ciclos de filas y columnas)
        for (int j = 0; j < gran_matriz[i].length; j++) {
            if (matriz_ganadora[i][j] == 0 && verifica_ganador(gran_matriz[i][j].getMatriz())) {
                matriz_ganadora[i][j] =turno ? 2 : 1;                                                               //Edita cuando hay un ganador
                System.out.println("Jugador " + (turno ? "O" : "X") + " ganador en: fila " + (i + 1) + " / columna: " + (j + 1));
            }}}
    if (verifica_ganador(matriz_ganadora)) {            //GANADOR SUPREMO
        resultados.setText((turno ? "O" : "X") + " Gana la partida");
        juego_ganado = true;
        return;
    } else {
        resultados.setText("-JUGANDO-");
    }
}

// Ganador de cualquier matriz 3x3:
    private boolean verifica_ganador(int[][] matriz) {
        for (int i = 0; i < 3; i++) { //Verticales
            if (matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) {
                return true;}
            if (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0) {
                return true;}
        }               //Diagonales
        if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) {
            return true;}
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0) {
            return true;}
        return false;
    }
}
    
    
    


