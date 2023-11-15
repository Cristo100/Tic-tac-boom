
package tictac;

public class gran_matriz {
    
    //Atributo
    private gatito[][] matriz;

    //Constructor
    public gran_matriz(gatito[][] gatitos) {
        matriz = gatitos;
    }

    
//metodos
    public gatito[][] getMatriz() {
        return matriz;
    }
    
    public int getLength() {
        return matriz.length;
    }
}