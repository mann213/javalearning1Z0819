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
public class Constructors_6_3 {
    private int x=1,y=2;
    protected int z = 9;
    public Constructors_6_3(int y){
        System.out.println(y);//prints the parameter passed in int y
        System.out.println(this.y);//prints this class y which is 2
    }
    public Constructors_6_3(int x, int y){//overloaded constructor
        System.out.println(y);//prints the parameter passed in int y
        System.out.println(this.y);//prints this class y which is 2
        System.out.println(x);//prints the parameter passed in int x
        System.out.println(this.x);//prints this class x which is 1
    }
    public void printField(){
        System.out.println(x);//prints the top level field
        System.out.println(this.x);//prints this class x which is 1
    }
    
    
    public static void main(String args[]){
    Constructors_6_3 c = new Constructors_6_3(3);//prints 3, 2
    Constructors_6_3 c2 = new Constructors_6_3(5,6);//prints 6,2,5,1
    System.out.println(c2.equals(c));//prints false
   //default constructor called if constructor do not exist
    c.printField();//prints 1,1
    DerivedClass3 dc3 = new DerivedClass3();//prints 4,2,9,8
    System.out.println(dc3.getClass());// prints class javalearning819.javabasics.DerivedClass3
    System.out.println(c.getClass());// class javalearning819.javabasics.Constructors_6_3
    }
}
class DerivedClass3 extends Constructors_6_3{
    public DerivedClass3(){
        super(4);//calls super class constructor
        int z = 8;
        System.out.println(this.z);//prints z from this top level class that is 9
        System.out.println(z);//prints the field int x =8;
    }
}