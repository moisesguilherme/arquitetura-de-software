package com.gotocode.injecaodedependencias.exercicio;

// Veículo depende de motor e de combustível um alto acoplamento
// a injeção de Dependência é apenas uma forma para resolvermos a Inversão de Controle.
public class Veiculo {

    public IMotor motor;
    public ICombustivel combustivel;

    // O Constructor Injection, ou seja, injetamos uma dependência de uma classe através do construtor desta classe.
    public Veiculo(IMotor motor, ICombustivel combustivel) {
        this.motor = motor;
        this.combustivel = combustivel;
    }

    public void ligarMotor(){
        motor.ligar();
        // problema se for elétrico pega um tipo
        combustivel.getTipoCombustivel();
    }

    public void desligarMotor(){
        motor.desligar();
    }

}
