package com.gotocode.injecaodedependencias;

import com.gotocode.injecaodedependencias.exercicioCarro.*;

public class ExecutaExercicio {
    // Criar um objeto veículo que pode ser moto ou carro,
    // O veículo possui um motor que pode ser motor de carro ou de moto.
    // Esse motor liga e desliga ele consome combustível álcool ou gasolina,
    // implemente de uma forma que pode trocar para ser elétrico.

    public static void main(String[] args) {
         Motor motorMoto = new Motor("Moto");
         Combustivel gasolina = new Combustivel("Gasolina");

         Veiculo moto = new Veiculo(motorMoto, gasolina);
         moto.ligarMotor();
         moto.desligarMotor();

         Motor motorCarro = new Motor("Carro");
         Combustivel alcool = new Combustivel("Alcool");
         Veiculo carro = new Veiculo(motorCarro, alcool);
         carro.ligarMotor();
         carro.desligarMotor();

         /*
        Motor motorCarroEletrico = new Motor("Carro-elétrico");
        Eletrico eletrico = new Eletrico("Elétrico");
        Veiculo carroEletrico = new Veiculo(motorCarroEletrico, eletrico);
        carroEletrico.ligarMotor();
        carroEletrico.desligarMotor();
         */

    }

}
