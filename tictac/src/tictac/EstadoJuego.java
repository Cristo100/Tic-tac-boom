package tictac;
import java.awt.*;
import java.io.Serializable;

public class EstadoJuego implements Serializable {
    private boolean turno;
    private Color color_boton;

    // Constructor
    public EstadoJuego(boolean turno, Color color_boton) {
        this.turno = turno;
        this.color_boton = color_boton;
        // Inicializa otros atributos si es necesario
    }

    // Métodos getters y setters
    public boolean isTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public Color getColorBoton() {
        return color_boton;
    }

    public void setColorBoton(Color color_boton) {
        this.color_boton = color_boton;
    }
}
