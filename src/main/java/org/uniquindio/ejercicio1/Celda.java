package org.uniquindio.ejercicio1;

public class Celda extends Espacio{
    private String codigo;
    private Prisionero prisionero;
    private ESTADO estado;
    private ESTA_PRISIONERO estaPrisionero;

    public Celda() {
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

    public ESTADO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO estado) {
        this.estado = estado;
    }

    public ESTA_PRISIONERO getEstaPrisionero() {
        return estaPrisionero;
    }

    public void setEstaPrisionero(ESTA_PRISIONERO estaPrisionero) {
        this.estaPrisionero = estaPrisionero;
    }
}
