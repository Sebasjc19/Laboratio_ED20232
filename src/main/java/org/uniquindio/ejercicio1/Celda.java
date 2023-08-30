package org.uniquindio.ejercicio1;

public class Celda extends Espacio{
    private String codigo;
    private Prisionero prisionero;
    private boolean verificado;

    public Celda(String codigo, Prisionero prisionero) {
        this.codigo = codigo;
        this.prisionero = prisionero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Prisionero getPrisionero() {
        return prisionero;
    }

    public void setPrisionero(Prisionero prisionero) {
        this.prisionero = prisionero;
    }

    public boolean isVerificado() {
        return verificado;
    }

    public void setVerificado(boolean verificado) {
        this.verificado = verificado;
    }


}
