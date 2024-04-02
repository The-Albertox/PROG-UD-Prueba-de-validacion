import net.salesianos.ejercicio1.clases.Calculadora;
import net.salesianos.ejercio2.clases.electrodomestcio.micoondas.Microondas;
import net.salesianos.ejercio2.clases.electrodomestcio.nevera.Nevera;

public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 3;
        int numero2 = 6;
        int numero3 = 73;
        System.out.println(Calculadora.sumarCuadrados(numero1));
        System.out.println(Calculadora.sumarCuadrados(numero2));
        System.out.println(Calculadora.sumarCuadrados(numero3));

        int[] notas1 = { 10, 4, 6, 1, 7 };
        int[] notas2 = { 4, 7, 9, 2, 3, 7, 8 };
        System.out.println(Calculadora.mediaNotas(notas1));
        System.out.println(Calculadora.mediaNotas(notas2));

        Nevera nevera = new Nevera("bosch", "t-800", 20, 40, 20);
        nevera.encender();
        System.out.println(nevera);
        nevera.apagar();
        System.out.println(nevera);

        Microondas microondas = new Microondas("sony", "v-1(punch the bullets)", 5, 700, true);
        microondas.encender();
        System.out.println(microondas);
        microondas.apagar();
        System.out.println(microondas);

    }
}
