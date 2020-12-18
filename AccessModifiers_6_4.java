/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning819.javabasics;

import static javalearning819.javabasics.AccessModifiers_6_4.y1;
import static javalearning819.javabasics.AccessModifiers_6_4.y2;

/**
 *
 * @author mpshah
 */
public class AccessModifiers_6_4 {
   int x= Methods_6_1.multiplyMethod(2,3,4);//OK, method with protected access from class Methods_6_1 from same package
   int y= Methods_6_1.addMethod(1, 1);//OK, method with public access from class Methods_6_1 
   //int z = Methods_6_1.subtractMethod(4,3);//NOT OK method has private access
   //int z= Methods.multiply(2,3,4);//NOT OK because method access is protected in different package
   public int x1 = 1;
   protected int x2 = 2;
   private int x3 = 3;
   
   public static int y1 = 11;
   protected static int y2 = 12;
   private static int y3 = 13;
   protected AccessModifiers_6_4(){
    System.out.println("Public access x1="+x1);
    System.out.println("Protected access x2="+x2);
    System.out.println("Private access x3="+x3);
    
    System.out.println("Public access y1="+y1);
    System.out.println("Protected access y2="+y2);
    System.out.println("Private access y3="+y3);
   }
   public static void main(String args[]){
       AccessModifiers_6_4 am = new AccessModifiers_6_4();//prints 1,2,3 
       DerivedAccessModifiers_6_4 dam = new DerivedAccessModifiers_6_4();//prints 1,2,3
       OtherAccessModifiersClass oam = new OtherAccessModifiersClass();//prints y1=11, y2=12
       
   }
}
class DerivedAccessModifiers_6_4 extends AccessModifiers_6_4{
    protected DerivedAccessModifiers_6_4(){
        super();
    }
}
class OtherAccessModifiersClass{
    public OtherAccessModifiersClass(){
    //super();//no super class
     //System.out.println("Public access x1="+x1);//NOT OK, cannot find symbol x1, instance field
    //System.out.println("Protected access x2="+x2);//NOT OK, cannot find symbol x2, instance field
    //System.out.println("Private access x3="+x3);//NOT OK, cannot find symbol x3, instance field
    System.out.println("From OtherAccessModifiersClass Public access y1="+y1);//static public field accessible, need import static class field
    System.out.println("Protected access y2="+y2);//static protected field accessible, same package, need import static class field
    //System.out.println("Private access y3="+y3);//not ok private static
    }
}
