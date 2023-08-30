package org.uniquindio.ejercicio1;

public class Piso {
    private int numeroPrisioneros;
    private Espacio[] espacio;

    public Piso(int numeroPrisioneros, Espacio[] espacio) {
        this.numeroPrisioneros = numeroPrisioneros;
        this.espacio = espacio;
    }

    public int getNumeroPrisioneros() {
        return numeroPrisioneros;
    }

    public void setNumeroPrisioneros(int numeroPrisioneros) {
        this.numeroPrisioneros = numeroPrisioneros;
    }

    public Espacio[] getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio[] espacio) {
        this.espacio = espacio;
    }
}
