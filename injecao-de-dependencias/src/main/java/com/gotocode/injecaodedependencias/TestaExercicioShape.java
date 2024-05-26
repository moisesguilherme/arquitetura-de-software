package com.gotocode.injecaodedependencias;

import com.gotocode.injecaodedependencias.exercicioShape.*;


public class TestaExercicioShape {

    public static void main(String[] args) {

        /*Triangle myTriangle = new Triangle();
        myTriangle.draw();

        Circle myCircle = new Circle();
        myCircle.draw();
        */

        // Using polymorphism
        /*
        Shape shape = new Triangle();
        shape.draw();

        Shape shape1 = new Circle();
        shape1.draw();
         */

        // Method parameter
        /*
        Shape shape = new Triangle(); //intialization
        myDrawMethod(shape);
        */

        Drawing drawing = new Drawing();

        Triangle myTriangle = new Triangle();
        Circle myCircle = new Circle();
        //Square mySquare = new Square();

        Shape mySquare = new Circle();

        drawing.setShape(mySquare);
        drawing.drawShape();

    }

    public static void myDrawMethod(Shape shape){
        shape.draw();
    }

}





