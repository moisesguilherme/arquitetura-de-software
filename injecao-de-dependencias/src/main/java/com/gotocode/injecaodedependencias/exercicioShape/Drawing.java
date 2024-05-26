package com.gotocode.injecaodedependencias.exercicioShape;


public class Drawing {

    // Não tem inicialização do objeto...
    private Shape shape;

    // Injeção de dependência
    public void setShape(Shape shape){
        this.shape = shape;
    }

    public void drawShape() {
        this.shape.draw();
    }
}

