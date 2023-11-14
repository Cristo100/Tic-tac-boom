package tic_tac_toe;

public class Casilla {
    int estadoCasilla;
    int casiCorde_x;
    int casiCorde_Y;
    
    public Casilla(int unaCordenada_x, int unaCordenada_y) {
        estadoCasilla = 0;
        casiCorde_x = unaCordenada_x;
        casiCorde_Y = unaCordenada_y;
    }
}
