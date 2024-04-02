package net.salesianos.ejercicio1.clases;

public class Calculadora {

    public static int sumarCuadrados(int numero) {
        double resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i * i;
        }
        return (int) resultado;
    }

    public static float mediaNotas(int[] numeros) {
        float resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado += numeros[i];
        }
        return (float) resultado / (float) numeros.length;
    }
}
