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
public class ExceptionHandling {
    public static void main(String args[]){
        DifferentMethods d = new DifferentMethods();
        
        try{
        d.createObject();
        }catch(NullPointerException npe){
            System.out.println(npe.getMessage());//prints null
        }finally{//always executes irrespective of exception occurred or not
             System.out.println("Object referenced to null");
        }
        
        try{
            try{
            d.createArray();
            }catch(ArrayIndexOutOfBoundsException abe){//Excpetion catches runtime error
                System.out.println(abe.getMessage());//prints Index 3 out of bounds for length 3
            }finally{
                System.out.println("Array index is out of array size");
            }
        }catch(Exception e){
                System.out.println(e.getMessage());
        }
        
        try{
            d.divideNumber(5, 0);
        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());//prints / by zero
        }finally{
            System.out.println("Input different values");
        }
        
        try{
            d.passArgsMethod(Integer.valueOf("null"),3);
        }catch(IllegalArgumentException iae){
             System.out.println(iae.getMessage());//prints For input string: "null"
        }finally//try nested in finally block
        {
            try{
                System.out.println("Nested-try from finally block executing...");
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                System.out.println("Inner finally block in outer finally block executing...");
            }
        }
        
        try{
            d.parseNumber("s");
        }catch(NumberFormatException nfe){
            System.out.println(nfe.getMessage());//prints For input string: "s"
        }finally{
            System.out.println("Code in finally block always executes");
        }
        
        try{
            Object x = Integer.valueOf(0);
            System.out.println((String)x);
        }catch(ClassCastException cce){
            System.out.println(cce.getMessage());//prints class java.lang.Integer cannot be cast to class java.lang.String
        }
        
    }
    
}
class DifferentMethods
{
    public void createObject(){
        Object obj1 = new Object();
        Object obj2 = new Object();
        obj1 = null;
        System.out.println(obj1.equals(obj2));
    }
    public void createArray(){
        int[] array1 = {1,2,3};
        System.out.println(array1[3]);//runtime error
    }
    
    public void divideNumber(int x , int y){
        System.out.println(x/y);
    }
    
    public void passArgsMethod(int s, int y){
        System.out.println("Arguments are s = "+String.valueOf(s)+" and y ="+y);
    }
    
    public void parseNumber(String s){
        System.out.println(Integer.parseInt(s));
    }
    
}
        
