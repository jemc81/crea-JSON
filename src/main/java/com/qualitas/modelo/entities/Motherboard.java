package com.qualitas.modelo.entities;

public class Motherboard {
    private String procesador;
    private Ram[] slots;
    private String marca;

    public Motherboard(String procesador, String marca) {
        this.procesador = procesador;
        this.slots = new Ram[2];
        this.marca = marca;
        
        Ram ram = new Ram("Kingston",2);
        slots[0]=ram;
    }

    public String getProcesador() {
        return procesador;
    }

    /**
     * @param procesador the procesador to set
     */
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    /**
     * @return the slots
     */
    public Ram[] getSlots() {
        return slots;
    }

    /**
     * @param slots the slots to set
     */
    public void setSlots(Ram[] slots) {
        this.slots = slots;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getMemoria(){
        int total = 0;
        for (Ram ram : slots){
           if(ram != null){
             total+=ram.getCapacidad();
           }
        }
        return total;
    }
}
