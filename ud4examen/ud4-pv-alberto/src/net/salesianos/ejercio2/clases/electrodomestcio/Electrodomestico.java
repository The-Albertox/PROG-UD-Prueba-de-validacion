package net.salesianos.ejercio2.clases.electrodomestcio;

public class Electrodomestico {
    protected String marca;
    protected String modelo;
    protected float peso;
    protected int potencia;
    protected boolean encendida;

    public Electrodomestico(String marca, String modelo, float peso, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.peso = peso;
        this.potencia = potencia;
      
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return this.potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void encender(){
        this.encendida = true;
    }

    public void apagar(){
        this.encendida = false;
    }

    
}
