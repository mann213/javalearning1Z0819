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
public class Encapsulation_6_5 {
    public int x = 1;
    protected int y = 2;
    private final int z;

    protected Encapsulation_6_5() {
        this.z = 3;
        this.y = 4;
    }
    public void printMethod()
    {
        System.out.println("From main class x="+x);
        System.out.println("From main class y="+y);
        System.out.println("From main class z="+z);
    }
    public static void main(String args[]){
        DerivedClass dc = new DerivedClass();
        dc.printMethod();
        NotDerivedClass ndc = new NotDerivedClass();
        ndc.printMethod();
        Encapsulation_6_5 e = new Encapsulation_6_5();
        e.printMethod();
    }
}
class DerivedClass extends Encapsulation_6_5{
    @Override//overrides the super class method
    public void printMethod()
    {
        System.out.println("From derived class x="+x);//prints 1
        System.out.println("From derived class y="+y);//prints 2
       // System.out.println(z);//NOT OK private access
       
    }
}
class NotDerivedClass{
    public void printMethod(){//not derived class can have public access
        //System.out.println(x);//cannot find x in non derived class
        //System.out.println(y);//cannot find y
       // System.out.println(z);//NOT OK no access
       Encapsulation_6_5 obj = new Encapsulation_6_5();
       System.out.println("From non derived class x="+obj.x);
       System.out.println("From non derived class y="+obj.y);
       //System.out.println("From non derived class y="+obj.z);
    }
}