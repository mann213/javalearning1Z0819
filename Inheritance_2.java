/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning819.javabasics;

/**
 *
 * @author mpshah
 */
public class Inheritance_2 {
    public static void main (String args[]){
        Square sq = new Square();//this is polymorphism
        Circle cir = new Circle();//Circle and Square are two forms of shapes
        sq.printShape(2);//each form prints its own shape
        cir.printShape(3);
        System.out.println(cir instanceof Shapes);//prints true
        System.out.println(cir instanceof Circle);//prints true
    }
}
abstract class Shapes{
    public abstract void printShape(int x);
}
class Square extends Shapes{
    public void printShape(int x){
    System.out.println("Printing square of side x = "+x+"...");
    }
}
class Circle extends Shapes{
    
    public void printShape(int r){
    System.out.println("Printing circle of radius r="+r+"...");
    }
}