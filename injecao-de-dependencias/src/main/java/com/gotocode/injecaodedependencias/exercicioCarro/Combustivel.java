package com.gotocode.injecaodedependencias.exercicioCarro;

public class Combustivel implements ICombustivel {

    public String tipoCombustivel;

    public Combustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
