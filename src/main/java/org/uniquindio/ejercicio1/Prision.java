package org.uniquindio.ejercicio1;

import java.util.ArrayList;

public class Prision {
    ArrayList<Piso> pisos;

    public Prision() {
        pisos = new ArrayList<>() ;
    }

    public ArrayList<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(ArrayList<Piso> pisos) {
        this.pisos = pisos;
    }
}
