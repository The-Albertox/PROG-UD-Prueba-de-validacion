package net.salesianos.ejercio2.clases.electrodomestcio.micoondas;

public class Microondas extends net.salesianos.ejercio2.clases.electrodomestcio.Electrodomestico {
    private boolean puertaAbierta;

    public Microondas(String marca, String modelo, float peso, int potencia, boolean puertaAbierta) {
        super(marca, modelo, peso, potencia);
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isPuertaAbierta() {
        return this.puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    @Override
    public void encender() {
        this.encendida = true;
        System.out.println("Algo huele a quemado");
    }

    @Override
    public String toString() {
        String mensaje = "------------------------" + "\n";
        mensaje += "* Tipo de electrodomestico: microondas " + "\n";
        mensaje += "* Marca = " + this.marca + "\n";
        mensaje += "* Modelo = " + this.modelo + "\n";
        mensaje += "* Peso = " + this.peso + " kg \n";
        mensaje += "* Potencia = " + this.potencia + " Kw \n";
        mensaje += "* Puerta = " + (this.puertaAbierta ? " Abierta " : " Cerrada ") + "\n";
        mensaje += "* Esta encendida = " + (this.encendida ? " si " : " no ") + "\n";
        mensaje += "-----------------------";
        return mensaje;
    }

}
