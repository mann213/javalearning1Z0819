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
public class AbstractClass_7_5 {
    public static void main(String args[])
    {
        String[] names = {"Rashmi","Ashish","Bhakti","Prasad","Dia","Jaya","Nandu"};
       // AbstractClass ac = new AbstractClass();//NOT OK, abstract class cannot be instantiated
        ImplementedClass ic = new ImplementedClass();//instantiation ok
        for(String name: names){
          ic.printNameMethod(name);
        }
    }   
}

abstract class AbstractClass{//used for encapsulation
    private String name;
    abstract void printNameMethod();//ends with a semi colon, implementation is not given hence no braces{}
    abstract void printPhoneNumbers();//method not implemented
 }
class ImplementedClass{
    public void printNameMethod(String name){
        System.out.println(name);
    }
}