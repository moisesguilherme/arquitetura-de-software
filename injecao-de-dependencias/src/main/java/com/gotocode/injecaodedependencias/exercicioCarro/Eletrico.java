package com.gotocode.injecaodedependencias.exercicioCarro;

public class Eletrico implements IEletrico {

    public String tipoVoltagem;

    public Eletrico(String tipo_combustivel) {
        this.tipoVoltagem = tipo_combustivel;
    }

    public String getTipoVoltagem() {
        return tipoVoltagem;
    }

    public void setTipoVoltagem(String tipoVoltagem) {
        this.tipoVoltagem = tipoVoltagem;
    }
}
