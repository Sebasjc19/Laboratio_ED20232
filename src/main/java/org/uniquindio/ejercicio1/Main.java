package org.uniquindio.ejercicio1;

import org.uniquindio.ejercicio1.*;

public class Main {
    public static void main(String[] args) {
        Prision prision = inicializarDatos();
        prision.getPisos().get(0).resolverCamino(4,0);
    }
    public static Prision inicializarDatos() {
        Prision prision = new Prision();

        //Se crea el primer piso de la prisión
        Piso piso = new Piso();

        //Se crean las celdas
        //Celda 1
        Celda celda1 = new Celda();
        celda1.setCodigo("01");
        celda1.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero1 = new Prisionero();
        prisionero1.setNombre("Jorge");
        prisionero1.setIdentificacion("123456789");

        celda1.setPrisionero(prisionero1);
        celda1.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 2
        Celda celda2 = new Celda();
        celda2.setCodigo("02");
        celda2.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero2 = new Prisionero();
        prisionero2.setNombre("Iván");
        prisionero2.setIdentificacion("987654321");

        celda2.setPrisionero(prisionero2);
        celda2.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 3
        Celda celda3 = new Celda();
        celda3.setCodigo("03");
        celda3.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero3 = new Prisionero();
        prisionero3.setNombre("José");
        prisionero3.setIdentificacion("273819391");

        celda3.setPrisionero(prisionero3);
        celda3.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Celda 4
        Celda celda4 = new Celda();
        celda4.setCodigo("04");
        celda4.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero4 = new Prisionero();
        prisionero4.setNombre("Tobías");
        prisionero4.setIdentificacion("273832311");

        celda4.setPrisionero(prisionero4);
        celda4.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Celda 5
        Celda celda5 = new Celda();
        celda5.setCodigo("05");
        celda5.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero5 = new Prisionero();
        prisionero5.setNombre("Anaís");
        prisionero5.setIdentificacion("28891211");

        celda5.setPrisionero(prisionero5);
        celda5.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 6
        Celda celda6 = new Celda();
        celda6.setCodigo("06");
        celda6.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero6 = new Prisionero();
        prisionero6.setNombre("Carlos");
        prisionero6.setIdentificacion("2831931023");

        celda6.setPrisionero(prisionero6);
        celda6.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 7
        Celda celda7 = new Celda();
        celda7.setCodigo("07");
        celda7.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero7 = new Prisionero();
        prisionero7.setNombre("Claire");
        prisionero7.setIdentificacion("212318291");

        celda7.setPrisionero(prisionero7);
        celda7.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Celda 8
        Celda celda8 = new Celda();
        celda8.setCodigo("08");
        celda8.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero8 = new Prisionero();
        prisionero8.setNombre("Nicolle");
        prisionero8.setIdentificacion("23242121");

        celda8.setPrisionero(prisionero8);
        celda8.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 9
        Celda celda9 = new Celda();
        celda9.setCodigo("09");
        celda9.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero9 = new Prisionero();
        prisionero9.setNombre("Miguel");
        prisionero9.setIdentificacion("280111221");

        celda9.setPrisionero(prisionero9);
        celda9.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Celda 10
        Celda celda10 = new Celda();
        celda10.setCodigo("10");
        celda10.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero10 = new Prisionero();
        prisionero10.setNombre("Joe");
        prisionero10.setIdentificacion("932812129");

        celda10.setPrisionero(prisionero10);
        celda10.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Celda 11
        Celda celda11 = new Celda();
        celda11.setCodigo("11");
        celda11.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero11 = new Prisionero();
        prisionero11.setNombre("Tina");
        prisionero11.setIdentificacion("03920128412");

        celda11.setPrisionero(prisionero11);
        celda11.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 12
        Celda celda12 = new Celda();
        celda12.setCodigo("12");
        celda12.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero12 = new Prisionero();
        prisionero12.setNombre("Valentina");
        prisionero12.setIdentificacion("134213421");

        celda12.setPrisionero(prisionero12);
        celda12.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 13
        Celda celda13 = new Celda();
        celda13.setCodigo("13");
        celda13.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero13 = new Prisionero();
        prisionero13.setNombre("Gumball");
        prisionero13.setIdentificacion("0983648921");

        celda13.setPrisionero(prisionero13);
        celda13.setEstaPrisionero(ESTA_PRISIONERO.ESTA);

        //Celda 14
        Celda celda14 = new Celda();
        celda14.setCodigo("14");
        celda14.setEstado(ESTADO.SIN_VERIFICAR);

        Prisionero prisionero14 = new Prisionero();
        prisionero14.setNombre("Sofía");
        prisionero14.setIdentificacion("134213421");

        celda14.setPrisionero(prisionero14);
        celda14.setEstaPrisionero(ESTA_PRISIONERO.NO_ESTA);

        //Se crea la matriz que va a guardar el piso 1
        Espacio[][] matrizEspacios = new Espacio[5][6];
        matrizEspacios[0][0] = celda1;
        matrizEspacios[0][1] = celda2;
        matrizEspacios[0][2] = celda3;
        matrizEspacios[0][3] = celda4;
        matrizEspacios[0][4] = celda5;
        matrizEspacios[0][5] = new Pasillo(TIPO.SALIDA);

        matrizEspacios[1][0] = celda6;
        matrizEspacios[1][1] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[1][2] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[1][3] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[1][4] = celda7;
        matrizEspacios[1][5] = new Pasillo(TIPO.CAMINO);

        matrizEspacios[2][0] = celda8;
        matrizEspacios[2][1] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[2][2] = celda9;
        matrizEspacios[2][3] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[2][4] = celda10;
        matrizEspacios[2][5] = new Pasillo(TIPO.CAMINO);

        matrizEspacios[3][0] = celda11;
        matrizEspacios[3][1] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[3][2] = celda12;
        matrizEspacios[3][3] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[3][4] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[3][5] = new Pasillo(TIPO.CAMINO);

        matrizEspacios[4][0] = new Pasillo(TIPO.ENTRADA);
        matrizEspacios[4][1] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[4][2] = celda13;
        matrizEspacios[4][3] = celda14;
        matrizEspacios[4][4] = new Pasillo(TIPO.CAMINO);
        matrizEspacios[4][5] = new Pasillo(TIPO.CAMINO);

        //Se guarda la matriz en el piso 1
        piso.setEspacio(matrizEspacios);
        //Se guarda la prisión con los datos quemados
        prision.getPisos().add(piso);

        return prision;
    }

    public static void imprimirPrisioneros(Piso piso) {
        Espacio[][] matrizEspacios = piso.getEspacio();

        for(int i = 0; i < matrizEspacios.length; i++) {
            for (int j = 0; j < matrizEspacios[i].length; j++) {
                if(matrizEspacios[i][j] instanceof Celda){

                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }

            }
            System.out.println("");
        }
    }
}