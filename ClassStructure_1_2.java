/**
 *
 * @author mpshah
 * Objective: Define structure of Java class
 * 
 */
//Scope of java variables
package javalearning819.javabasics; //package name is the first line
//import javalearning808.*;
import java.util.Date; //import statements follow after package name
public class ClassStructure_1_2  { //declare a class, interface, enum
//declare class variables (static variables)
   public enum class_members {fields, methods}; 
   public interface ClassInterface{
      // private abstract void methodPrint(); //NOT OK, abstract and private do not combine together
       public abstract void methodPrint();
   } 
   public static class NestedClass extends ClassStructure_1_2 implements ClassInterface{ //nested class
       private static int x,y; //declare variables
       public int multiplyMethod(int x, int y){
           return x * y;
       }
       public void methodPrint(){//it is mandatory to implement abstract method and interface method, overrides interface method 
           System.out.println("This is interface method overriding");
       }
         
   }
   public void getTodaysDate(){
       
       System.out.println(new Date());
   }
   {
       System.out.println("This is a statement block");
   }
   public static void main (String args[]){
       ClassStructure_1_2 cs = new ClassStructure_1_2();//prints the statement block
       cs.getTodaysDate();//prints today's date
       
       NestedClass nc = new NestedClass();//prints the statement block
       nc.methodPrint(); // prints "This is inteface method overriding"
       nc.x = 5;//access and set class variables
       nc.y = 2;
       System.out.println(nc.multiplyMethod(nc.x, nc.y));// calls class method,  prints 10
       for(var s : class_members.values()){//access enum values
       System.out.println(s);
       }
   }
   
}

    

 


