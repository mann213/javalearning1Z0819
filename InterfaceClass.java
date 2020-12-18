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
//a class can implement more than one interface
public class InterfaceClass implements printableInterface, calculatingInterface {
    
    public int calculateMethod(int x, int y){
        return x+y;
    }
    //need to implement every method from interfaces
    @Override// compiler checks if method has properly overriden
    public void printMethod2(int x){
        System.out.println("Implementing printableInterface printMethod2 in InterfaceClass");
        System.out.println("This is method "+x);
    }
 
    public static void main(String args[]){
        InterfaceClass ic = new InterfaceClass();
        ic.printMethod1();//this has private method inside
        ic.printMethod2(2);
        ic.calculateMethod(1, 2);
        /*prints
        Prinitng from private method of interface
        Implementing printableInterface printMethod2 in InterfaceClass
        This is method 2
        */
        
    }
    
    
}
interface printableInterface {//interface has public access 
  default void printMethod1(){//default method has a body, gives it a default implementation private to package
      print();//private method in interface allowed from Java 9
  }
  public abstract void printMethod2(int x);//abstract method
  private static void print(){ //private static method
  System.out.println("Prinitng from private method of interface");
  }
  //private int x; //modifier private not allowed in interface
  //protected int x;//modifier protected not allowed in interface
  
} 
interface calculatingInterface{
   int SIZE = 10;//constant variable declaration ok in interface
   public int calculateMethod(int x, int y);
}