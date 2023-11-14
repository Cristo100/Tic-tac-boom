package tic_tac_toe;

public class Gato {
    int estadoGato;
    int gatoCorde_x;
    int gatoCorde_y;
    Casilla c1;
    Casilla c2;
    Casilla c3;
    Casilla c4;
    Casilla c5;
    Casilla c6;
    Casilla c7;
    Casilla c8;
    Casilla c9;
    
    public Gato(int gatoCorde_X, int gatoCorde_Y) {
        estadoGato = 0;
        gatoCorde_x = gatoCorde_X;
        gatoCorde_y = gatoCorde_Y;
        c1 = new Casilla(1, 1);
        c2 = new Casilla(2, 1);
        c3 = new Casilla(3, 1);
        c4 = new Casilla(1, 2);
        c5 = new Casilla(2, 2);
        c6 = new Casilla(3, 2);
        c7 = new Casilla(1, 3);
        c8 = new Casilla(2, 3);
        c9 = new Casilla(3, 3);
    }
}
