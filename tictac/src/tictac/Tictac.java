
package tictac;

import java.awt.EventQueue;


public class Tictac {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ventana v1 = new ventana();
            v1.setVisible(true);
        });
    }
}