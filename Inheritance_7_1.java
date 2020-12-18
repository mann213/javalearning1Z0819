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
public class Inheritance_7_1 {
    public static void main(String args[]){
        Subclass sc = new Subclass();
        sc.CalculateMethod(5, 4);
        /* prints 
        Calculate for x = 5 and y = 4
        Output of addition x+y= 9
        Output of subtraction x-y=1
        Output of multiplication x*y= 20
        Output of division x/y=1*/
        
    }
    
}
class Superclass{
    private int x, y; //private fields 
    public Superclass(){
        System.out.println(this.x + this.y);
    }
    public void CalculateMethod(int x, int y){
        System.out.println("Calculate for x = "+x+" and y = "+y);
        
     }
    
    
}
class Subclass extends Superclass{
    private int x,y;
    @Override//indicates compiler of override 
    public void CalculateMethod(int x, int y){//overrides the super class method
        super.CalculateMethod(x, y);//super class method
        System.out.println("Output of addition x+y= "+ addMethod(x,y));
        System.out.println("Output of subtraction x-y="+ subtractMethod(x,y));
        System.out.println("Output of multiplication x*y= "+ multiplyMethod(x,y));
        System.out.println("Output of division x/y="+ divideMethod(x,y));
    }
    private int addMethod(int x, int y){
        return x+y;
    }
    private int subtractMethod(int x, int y){
        return x-y;
    }
    private int multiplyMethod(int x, int y){
        return x * y;
    }
    private int divideMethod(int x, int y){
        return x/y;
    }
    
}