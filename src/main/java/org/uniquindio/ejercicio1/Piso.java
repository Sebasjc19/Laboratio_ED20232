package org.uniquindio.ejercicio1;

public class Piso {
    private int numeroPrisioneros;
    private Espacio[][] espacio;
    public int cantidad;
    public int getNumeroPrisioneros() {
        return numeroPrisioneros;
    }

    public void setNumeroPrisioneros(int numeroPrisioneros) {
        this.numeroPrisioneros = numeroPrisioneros;
    }

    public Espacio[][] getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio[][] espacio) {
        this.espacio = espacio;
    }

    public void resolverCamino(int x, int y){
        if (paso(x, y, 0)) {
            espacio[x][y] = new Pasillo(TIPO.ENTRADA);
        }
    }

    private boolean paso(int x, int y, int cantidad)
    {
        if (espacio[x][y] instanceof Pasillo && ((Pasillo) espacio[x][y]).getTipopasillo()==TIPO.SALIDA){ // si hemos llegado a X quiere decir que hemos encontrado solución
            cantidad+= verificarAlrededor(x,y); //suma los lados de la ultima casilla
            this.cantidad=cantidad; //Los asigna
            System.out.println("Finalizado! cantidad de presos: "+cantidad);
            System.out.println("Ruta optima: ");
            imprimirPrisioneros();
            return true; //termina
        }
        //Determina si está parado en uan celda o en un pasillo ya recorrido
        if (espacio[x][y] instanceof Celda || ((Pasillo)espacio[x][y]).getTipopasillo()==TIPO.RECORRIDO ||((Pasillo)espacio[x][y]).getTipopasillo()==TIPO.SINSALIDA) { // si llegamos a una pared o al mismo punto,
            return false; // Se devuelve
        }
        ((Pasillo)espacio[x][y]).setTipopasillo(TIPO.RECORRIDO); // marcamos la posición como visitada (si es la primera, en las coordenadas x e y
        cantidad+= verificarAlrededor(x,y); //Sumamos la cantidad de celdas
        imprimirPrisioneros();

        boolean result; //
        if (x>0){
            result=paso(x-1, y, cantidad); // intentamos ir hacia ARRIBA. primer llamada recursiva
            if (result) return true;
        }
        //
        if (x>0 && y<espacio[0].length-1){
            result=paso(x-1, y+1, cantidad); // intentamos ir hacia Diagonal derecha superior. Segunda llamada recursiva
            if (result) return true;
        }
        if(y<espacio[0].length-1){
            result=paso(x, y+1, cantidad); // intentamos ir hacia la DERECHA. tercera llamada recursiva
            if (result)return true;
        }
        //
        if (x<espacio.length-1 && y<espacio[0].length-1){
            result=paso(x+1, y+1, cantidad); // intentamos ir hacia diagonal inferior derecha. Cuarta llamada recursiva
            if (result) return true;
        }
        if (x<espacio.length-1){
            result=paso(x+1, y, cantidad); // intentamos ir hacia ABAJO. quinta llamada recursiva
            if (result) return true;
        }
        //
        if (y<espacio[0].length-1 && x>0){
            result=paso(x+1, y-1, cantidad); // intentamos ir hacia la diagonal inferior izquierda. sexta llamada recursiva
            if (result) return true;
        }
        if (y>0){
            result=paso(x, y-1, cantidad); // intentamos ir hacia la IZQUIERDA. septima llamada recursiva
            if (result) return true;
        }
        //
        if (y>0 && x>0){
            result=paso(x-1, y-1, cantidad); // intentamos ir hacia la IZQUIERDA. octava llamada recursiva
            if (result) return true;
        }

        espacio[x][y]=new Pasillo(TIPO.SINSALIDA);
        return false;


    }

    public int verificarAlrededor(int x, int y) {
        int prisioneros = 0;
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 8; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 0 && newX < espacio.length && newY >= 0 && newY < espacio[0].length) {
                if (espacio[newX][newY] instanceof Celda && ((Celda) espacio[newX][newY]).getEstado() == ESTADO.SIN_VERIFICAR) {
                    if (((Celda) espacio[newX][newY]).getEstaPrisionero() == ESTA_PRISIONERO.ESTA){
                        prisioneros++;
                    }
                    ((Celda) espacio[newX][newY]).setEstado(ESTADO.VERIFICADA);
                }
            }
        }

        return prisioneros;
    }

    public  void imprimirPrisioneros() {

        for(int i = 0; i < espacio.length; i++) {
            for (int j = 0; j < espacio[i].length; j++) {
                if(espacio[i][j] instanceof Celda){
                    System.out.print(" # ");
                }else {
                    if (espacio[i][j] instanceof Pasillo && ((Pasillo)espacio[i][j]).getTipopasillo()==TIPO.RECORRIDO){
                        System.out.print(" * ");
                    }
                    if (espacio[i][j] instanceof Pasillo && ((Pasillo)espacio[i][j]).getTipopasillo()==TIPO.CAMINO){
                        System.out.print(" - ");
                    }
                    if (espacio[i][j] instanceof Pasillo && ((Pasillo)espacio[i][j]).getTipopasillo()==TIPO.SALIDA){
                        System.out.print(" S ");
                    }
                }

            }
            System.out.println("");
        }
    }


}
