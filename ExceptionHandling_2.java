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
public class ExceptionHandling_2 {
    public static void main(String args[]) throws Exception{//throws used by a method signature, can throw multiple exceptions
       DifferentMethods_2 d2 = new DifferentMethods_2();
       d2.createObject();
       //Exception d = new Exception();
       //throw d;//throws exception as declared above
    }
    
}
class DifferentMethods_2{
    public void createObject() throws NullPointerException{//tells what kind of exception will be thrown
        Object object1 = new Object();
        Object object2 = new Object();
        object2=null;
        if(object2!=null){
        object2.equals(object1);
        }
        else{
          //throw new NullPointerException("Exception handled by throws statement");//throws an exception, is always followed by an object new.
        }
        }
    }
