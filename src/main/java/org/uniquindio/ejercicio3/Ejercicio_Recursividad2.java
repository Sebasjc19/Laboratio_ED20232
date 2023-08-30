package org.uniquindio.ejercicio3;

public class Ejercicio_Recursividad2 {
    public static void main(String[] args) {
        int[] dados = {1,1,1};
        int valorEsperado = 6;
        tiradas(dados, valorEsperado,0,0);
    }

    private static void tiradas(int[] dados, int valorEsperado, int suma, int tirada) {
        if (tirada==dados.length && suma == valorEsperado){
            for (int i = 0; i < dados.length; i++) {
                if (i == dados.length-1){
                    System.out.print(dados[i]+" = ");
                } else{
                    System.out.print(dados[i]+" + ");
                }
            }
            System.out.print(suma+"\n");
        } else if (tirada != dados.length) {
            for (int i = 1; i <= 6; i++) {
                dados[tirada] = i;
                suma += i;
                tiradas(dados, valorEsperado, suma, tirada+1);
                suma -= i;
            }
        }
    }
}
