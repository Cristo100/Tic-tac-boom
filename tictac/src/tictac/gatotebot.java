
package tictac;
//Importaciones:
import java.awt.Color;
import java.util.Random;

public class gatotebot extends gatito{
//ATRIBUTOS:
                    boolean turno;
                    Color color_boton;
                    int[][] matriz_ganadora = new int[3][3];
                    boolean juego_ganado;
                    gatito[][] gran_matriz;

//Constructor
                    public gatotebot() {
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

                    
//METODOS:
                    // Configurar cuadros dentro del gran gato:
                    public void setGatito(int fila, int columna, gatito cuadro) {
                        gran_matriz[fila][columna] = cuadro;
                    }
                    public gatito getGatito(int fila, int columna) {
                        return gran_matriz[fila][columna];
                    }

 //COORDENADAS: Por cada boton.
    public void coordenada(int[][] matriz, int x, int y, int gany, int ganx, javax.swing.JLabel resultados) {
        
        if (juego_ganado == true){return;}                              //impide seguir jugando despues de ganar.
        if (matriz_ganadora[ganx][gany] != 0) {return;}         //impide seguir jugando en una matriz victoriosa.

        if (matriz[x][y] == 0) {                                                //Jugada disponible:
            if (turno) {matriz[x][y] = 1;
            } else      {matriz[x][y] = 2;
            }
            turno = !turno;
            verificacion(resultados);                                       //Ver si se gano con la jugada:
        }
    }
    
//Coordenadabot: turno de la computadora, aleatorio.
public void coordenadabot(int[][] matriz, int gany, int ganx, javax.swing.JLabel resultados){
    while(!turno){                                                              //repeticion hasta que haga una jugada disponible:
    Random rand = new Random();                                 //Randomizador de movimientos:
        int x = rand.nextInt(3);                                // Numeros del 0 al 2
        int y = rand.nextInt(3);
        
        
        
        //Lo mismo que coordenadas, pero con el turno en falso:
    if (juego_ganado == true){return;}
    if (matriz_ganadora[ganx][gany] != 0) {return;}
    
    if(matriz[x][y] == 0) {
        if (turno) {matriz[x][y] = 1;
        } else      {matriz[x][y] = 2;
        }
        turno = !turno;
        verificacion(resultados);
    }
    }
}


//VERIFICACIONES:
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
}