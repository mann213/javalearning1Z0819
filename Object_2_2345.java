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
public class Object_2_2345 {
    private static int x = 1,y=1;//declaration of static fields
    public static class Class{
        private int x=2,y=2;//declaration of fields in nested class
        protected void setMethod(int x, int y){//declaration of methods
            System.out.println("this x in set ="+this.x);//prints 2
            System.out.println("this y in set= "+this.y);//prints 2
            this.x = x;//this is a keyword and refers to this class
            this.y = y;//this classes y is now 3
            System.out.println("x in set ="+x);//prints object.x
            System.out.println("y in set ="+y);//prints object.y
            
        }
        public int getMethod(int x, int y){
            System.out.println("x in get="+x); //prints arg passed to get method
            System.out.println("y in get="+y); //prints arg passed to get method
            return x * y;
        }
    
    }
    public static void main(String args[]){
        Class object1 = new Class();
        object1.setMethod(3, 3);//prints x=3, y=3
        System.out.println(object1.getMethod(4, 5));//prints x=4, y=5, hence x*y=20
        System.out.println("x in main="+x); //prints 1
        System.out.println("y in main="+y); //prints 1
        System.out.println(x + y);//x=1,y=1 prints x+y=2
        
        Class object2 = new Class();
        boolean b1 = object1.equals(object2);
        System.out.println("'Both objects are equal' is "+b1);//false
        
        object2 = object1;//dereference by reassignment
        boolean b2 = object1.equals(object2);
        System.out.println("'Both objects are equal' is "+b2);//true
        
        object2.setMethod(9, 10);//object2 = object1 hence, modified the same object
        System.out.println(object1.x);//prints 9
        System.out.println(object1.y);//prints 10
         System.out.println(object2.x);//prints 9
        System.out.println(object2.y);//prints 10
        
        object1 = null; //object1 free for garbage collection
        System.gc();//request to clean up memory
        //boolean b3 = object1.equals(object2);//NOT OK , runtime error, NullPOinterException
        //System.out.println(object1.x);//Runtime error
        //System.out.println(object1.y);//Runtime error
        Class object3 = new Class();//OK as object not null  
        System.out.println(object3.x);//prints 2
        System.out.println(object3.y);//prints 2
        
        object3.setMethod(5, 5);//object3 is not equal to object2
        boolean b3 = object2.equals(object3);
        System.out.println("'Both objects are equal' is "+b3);//prints false
        System.out.println(object3.x);//prints 5
        System.out.println(object3.y);//prints 5
        System.out.println(object2.x);//prints 9
        System.out.println(object2.y);//prints 10
        
        
        
    }
}
    
