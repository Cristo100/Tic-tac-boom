package tic_tac_toe;

public class MegaGato {
    int estadoMegaGato;
    Gato g1;
    Gato g2;
    Gato g3;
    Gato g4;
    Gato g5;
    Gato g6;
    Gato g7;
    Gato g8;
    Gato g9;
    
    public MegaGato() {
        estadoMegaGato = 0;
        g1 = new Gato(1,1);
        g1 = new Gato(2,1);
        g1 = new Gato(3,1);
        g1 = new Gato(1,2);
        g1 = new Gato(2,2);
        g1 = new Gato(3,2);
        g1 = new Gato(1,3);
        g1 = new Gato(2,3);
        g1 = new Gato(3,3);
    }
}
