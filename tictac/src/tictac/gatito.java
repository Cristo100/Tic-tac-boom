
package tictac;

public class gatito {
    
//Atributos------------------------------------------------------------
    int[][] matriz;

    
//Constructor---------------------------------------------------------
    public gatito() {
        this.matriz = new int[3][3];
    }

//Metodos-------------------------------------------------------------
    public int[][] getMatriz() {
        return matriz;
    }

    // Ganador de cualquier matriz 3x3:
    protected boolean verifica_ganador(int[][] matriz) {
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