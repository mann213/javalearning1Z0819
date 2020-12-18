package javalearning819.javabasics;

//import javalearning808.*;

/*
 * author:@mpshah
 * Objective: Scope of variables
 */

public class ScopeOfVariables_1_1 {
    static int x = 400;
    static int y = 401; 
    static int z = 402;
    int ns = 999;
    static int ScopeOfVariables_1_1 = 98;
    static int javalearning808 = 67;
    
    // int x =99;//NOT OK, static variable and instance variable cannot have same name 
    //System.out.print(ns);NOT OK cannot find symbol
    //System.out.println(ScopeOfVariables_1_1.ns);//NOT OK cannot find symbol
    static public void main(String args[]){
        int p = 98;
        
        System.out.println(ScopeOfVariables_1_1);//OK, obscuring
        System.out.println(javalearning808);//OK, obscuring
        //for(int p=0;p<1;p++){// NOT OK, variable already defined in main
            for(int x=0;x<1;x++){
            int l = 322;
            System.out.println("in for loop l ="+l);//prints for loop variables
            System.out.println("in for loop x ="+x);//print for loop variables, static varialbe shadowed
            System.out.println("in for loop y ="+y); //prints static variables
            System.out.println("in for loop z ="+z);//prints static variables
           // System.out.println("in for loop ns ="+ns); //NOT OK instance variable cannot be referenced in static context
            
        }
         if(true)
        {
            int x = 189; int y = 165;int k = 345;
            System.out.println("in if loop k ="+k);//if variables printed
            System.out.println("in if loop x ="+x);//if variables printed
            System.out.println("in if loop y ="+y);//if variables printed
            System.out.println("in if loop z ="+z);//static variable printed
           // System.out.println("in if loop ns ="+ns);//NOT OK instance variable cannot be referenced in static context
        }
        {
         int x = 245; int z = 254;int j = 333;
         System.out.println("in block j = "+j);//block variables printed
         System.out.println("in block x = "+x);//block variables printed
         System.out.println("in block y ="+y);//static variables printed
         System.out.println("in block z ="+z);//block variables printed
        // System.out.println("in block loop i="+i);// NOT OK, not declared
         //System.out.println("in block loop ns ="+ns);//NOT OK instance variable cannot be referenced in static context
        }
        
        while(y >0){
            int i = 732;int y = 791; int z=799;
            System.out.println("in while loop x="+x);//static variable printed
            System.out.println("in while loop y="+y);//while loop variables printed
            System.out.println("in while loop z="+z);//while loop variables printed
            System.out.println("in while loop i="+i);//while loop variables printed
           // System.out.println("in while loop ns ="+ns);//NOT OK instance variable cannot be referenced in static context
            break;
        }
        System.out.println("in main loop x="+x);//static variable printed
            System.out.println("in main loop y="+y);//static variable printed
            System.out.println("in main loop z="+z);//static variable printed
           //System.out.println("in main loop i="+i);//Not OK, out of scope of while
            //System.out.println("in main loop j="+j);//Not OK, out of scope of block
            //System.out.println("in main loop k="+k);//Not OK, out of scope of if
            //System.out.println("in main loop l="+l);//Not OK, out of scope of for
           //System.out.println("in main loop ns ="+ns);//NOT OK instance variable cannot be referenced in static context
    }
}
