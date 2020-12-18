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

public class Methods_6_1 {
    public Methods_6_1(){
         System.out.println(multiplyMethod(8,9));
         System.out.println(addMethod(8,9));
    }
  
    public static void main (String[] args){
        System.out.println(multiplyMethod(2,3,4));//prints 24, static method
        System.out.println(multiplyMethod(2,3.14));//prints 6.28, static method
        Methods_6_1 m = new Methods_6_1();//prints 72 and 17
        System.out.println(m.addMethod(3, 4));//OK, instance methods, prints 7
        //addMethod(4,3);//NOT OK, non static method cannot be referenced under static context
        DerivedClass1 dc1 = new DerivedClass1();
        System.out.println(dc1.x);//prints 24
        System.out.println(dc1.z);//prints 5
        System.out.println(m.subtractMethod(5,2));//OK private access, non static method, prints 3 
        System.out.println(dc1.divideMethod(4,2));
    }
    //static method
    public static double multiplyMethod(double x, double y){
      return x * y  ;
    }
    //method overloading
    protected static int multiplyMethod(int x, int y,int z){
      return x * y * z;  
    }
    //instance method
    public static int addMethod(int x, int y){
        return x+y;
    }
    private int subtractMethod(int x, int y){
        return x - y;
    }
    protected int divideMethod(int x,int y)
    {
        return x/y;
    }
}
class DerivedClass1 extends Methods_6_1{//derived class
    //multiplyMethod(2,3);//cannot find static method
    //addMethod(2,3);//cannot find instance method
    //Methods_6_1 m = new Methods_6_1();
    int x = Methods_6_1.multiplyMethod(2,3,4);//OK protected access
    int z = Methods_6_1.addMethod(2,3);//OK public access
    //int y = Methods_6_1.subtractMethod(5,2);//NOT OK, private access
    @Override//compiler checks the method is properly overridden
    public int divideMethod(int x, int y){//override method,should always have stronger access privileges than or equal to superclass,access public or protected is ok
      x=x*2; 
      return x/y;    
    }
      
}