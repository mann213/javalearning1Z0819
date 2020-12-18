/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning819.javabasics;

//import javalearning808.*;

/**
 *
 * @author mpshah
 */

public class Loops_5_12345 {
    public static void main(String args[]){
        
        //for loop 
         for (int i=0;i<5;i++){
            if(i==2)break;
            System.out.println("for loop i="+i);//print 0,1 and breaks out of the loop
         }
         
         //while loop 
         int x=4;int y=5;
         while(y > x)
         {
             System.out.println("while loop x="+x);//prints 4
             x++;
         }
         
         //do-while loop 
         do{//executes atleast once
             System.out.println("do while y="+y);
             System.out.println("do while x="+x);//prints 5
         }while(y>x);
         
         //enhanced for loop
         String loops[] = {"forloop", "whileloop", "dowhileloop"};
         for(String eachloop: loops)
         {
             System.out.println("Printing each loop "+eachloop);
         }
         
         //Nested for loop
         for (int i=0;i<2;i++){
             for(int j=0;j<2;j++){
                 if(j==1)continue;
                 System.out.println("Printing In the nested for construct i,j "+i+" ,"+j);
             }
         }
         
         //Nested while loop
         int a=1;int b=1;
         while(a>0)
         {
             while (b>0){
                 System.out.println("Printing In the nested while construct a,b "+a+" ,"+b);
                 b--;
             }
             a--;
         }
         
         //Nested do-while
         do{
             do{
              System.out.println("In the nested do-while construct a, b "+a+" ,"+b);
              b++;
             }while(b==0);
             a++;
         }while(a==0);
         ;
         //For loop with 2 or more variables
         for(int g=1,h=2;g<2;g++,h++)
         {
             System.out.println("In the for loop construct g, h "+g+","+h);
         }
    }
    
}
