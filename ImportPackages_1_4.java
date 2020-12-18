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
//import javalearning808.*;
import java.lang.*;//OK , redundant import
import java.util.*;//OK , redundant import
import java.util.Date;
public class ImportPackages_1_4 implements AnInterface{
    {
        System.out.println("Main class invoked "+ (new Date()));
    }
    public void methodToOverride(){
        System.out.println("Overriding interface method");
    }
    public static void main(String[] args){
        ImportPackages_1_4 ip = new ImportPackages_1_4();
        SecondClass sc = new SecondClass();
        ip.methodToOverride();
        for(var s : FirstEnum.values()){
            System.out.println(s);
        }
    }
   
}
/*public class AnotherClass{//NOT OK, no 2 public classes can coexist in the same file
    
}*/
class SecondClass{ //OK
    {
    System.out.println("Second Class invoked "+(new Date()));
    }
}
// public interface FirstInterface{}//NOT OK, public class and public interface cannot coexist
interface AnInterface{ //OK
    public abstract void methodToOverride();
}
//public enum PublicEnum {}//NOT OK, public enum and public class cannot coexist

enum FirstEnum{ //OK
   element1,element2,element3
}
 

        
