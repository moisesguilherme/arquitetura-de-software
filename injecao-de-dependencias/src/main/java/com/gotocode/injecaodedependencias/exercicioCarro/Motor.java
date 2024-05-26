package com.gotocode.injecaodedependencias.exercicioCarro;

public class Motor implements IMotor{

    public String tipoMotor;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void ligar(){
        System.out.println("Motor: " + getTipoMotor() + " ligado");
    }


    public void desligar(){
        System.out.println("Motor desligado!");
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
