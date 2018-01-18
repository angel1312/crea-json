package com.qualitas.modelo.entities;


public class MotherBoard {
    
    private String procesador;
    private Ram[] slots;
    private String marca;

    public MotherBoard(String procesador, String marca) {
        this.procesador = procesador;
        this.slots = new Ram[2];
        this.marca = marca;
        
        Ram ram = new Ram("Kingston",2);
        slots[0]=ram;
    }
    
    public int getMemoria(){
        int total = 0;
        for (Ram ram : slots){
            if (ram!= null) {
                total+=ram.getCapacidad();
            }
            
        }
        return total;
    }
    
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public Ram[] getSlots() {
        return slots;
    }

    public void setSlots(Ram[] slots) {
        this.slots = slots;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
}
