package org.uniquindio.ejercicio1;

public class Pasillo extends Espacio{
    private TIPO tipopasillo;

    public Pasillo(TIPO tipopasillo) {
        this.tipopasillo = tipopasillo;
    }

    public TIPO getTipopasillo() {
        return tipopasillo;
    }
    public void setTipopasillo(TIPO tipopasillo) {
        this.tipopasillo = tipopasillo;
    }
}
