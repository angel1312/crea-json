package com.qualitas.modelo.entities;


public class Computadora {
    
    private String marca;
    private int ram;
    private int disco;
   
    
    public Computadora(String marca, int ram, int disco) {
        this.marca = marca;
        this.ram = ram;
        this.disco = disco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", ram=" + ram + ", disco=" + disco + '}';
    }
  
    
}
