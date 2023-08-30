package org.uniquindio.ejercicio2;

public class Ejercicio_Recursividad {
    public static void main(String[] args) {
        int[] dados = {1,1,1};
        int valorSuperar = 6;
        tiradas(dados, valorSuperar,0,0);
    }

    private static void tiradas(int[] dados, int valorSuperar, int suma, int tirada) {
        if (tirada==dados.length && suma > valorSuperar){
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
                tiradas(dados, valorSuperar, suma, tirada+1);
                suma -= i;
            }
        }
    }
}
