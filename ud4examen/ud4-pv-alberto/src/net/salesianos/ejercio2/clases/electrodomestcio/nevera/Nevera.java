package net.salesianos.ejercio2.clases.electrodomestcio.nevera;

public class Nevera extends net.salesianos.ejercio2.clases.electrodomestcio.Electrodomestico {
    private int temperatura;

    public Nevera(String marca, String modelo, float peso, int potencia, int temperatura) {
        super(marca, modelo, peso, potencia);
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public void encender() {
        this.encendida = true;
        System.out.println("¡Nios, fuerte pelete");
    }

    @Override
    public String toString() {
        String mensaje = "------------------------" + "\n";
        mensaje += "* Tipo de electrodomestico: Nevera" + "\n";
        mensaje += "* Marca = " + this.marca + "\n";
        mensaje += "* Modelo = " + this.modelo + "\n";
        mensaje += "* Peso = " + this.peso + " kg \n";
        mensaje += "* Potencia = " + this.potencia + " Kw \n";
        mensaje += "* temperatura = " + this.temperatura + " º \n";
        mensaje += "* Esta encendida = " + (this.encendida ? " si " : " no ") + "\n";
        mensaje += "-----------------------";
        return mensaje;
    }
}
