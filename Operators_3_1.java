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
import java.util.ArrayList; //for study of Diamond operator
public class Operators_3_1 {
    public static void main(String args[]){
        try{
        /* Arithmetic Operators */
        /* ***Post - Pre Operators *** */
        int x = 9;
        System.out.println(x);//prints 9
        System.out.println(x++);//prints 9
        System.out.println(++x);//prints 11
        System.out.println(--x);//prints 10
        System.out.println(x--);//prints 10
        System.out.println(x); //prints 9
        
        /* Division By Zero*/
        int a = 7; int b = 0, c = 3, d = 4, e = 6;
        //System.out.println(a/b);//compile time OK, runtime: Exception in thread "main" java.lang.ArithmeticException: / by zero
        
        /* Operator precedence */
        int z = ++a + a++ / d - --c * e % 2;//% modulus operator
        System.out.println(z);//prints 10
        
        /* Logical operators */
        byte bw1 = -4 ;//bitwise 11111100
        byte bw2 = 0b00000100 ; //bitwise 4 is 00000100
        System.out.println(~bw1);//prints 3 (bitwise not)
        System.out.println(~bw2);//prints -5
        byte bw3 = (byte)(~bw2);
        System.out.println(bw3); //prints -5
        System.out.println(bw1 & bw2);//prints 4 (bitwise and), non-short circuiting and
        System.out.println(bw1 | bw2); //prints -4 (bitwise or), non short circuiting or
        System.out.println(bw1 ^ bw2);//prints -8 (bitwise xor), non short circuiting xor
        System.out.println(bw1 >> bw2);//prints -1 (bitwise signed right shift)
        System.out.println(bw1 << bw2);//prints -64 (bitwise signed left shift)
        System.out.println(bw1 >>> bw2);//prints 268435455 (bitwise unsigned right shift)
        //System.out.println(bw1 <<< bw2);// NOT OK, <<< does not exist
        //System.out.println(1 && 2);//NOT OK
        System.out.println(10>9 || 10<9);// OK prints true , short circuiting and
        System.out.println(10>9 && 10<9);// OK prints false, short circuiting or
        System.out.println(10>9 ? 2 : 5);//prints 2, ternary operator is short circuiting as well
        //System.out.println(!10);//NOT OK
        System.out.println(!false);//prints true
        
        /* Relational Operators */
        System.out.println(10>9);//prints true
        System.out.println(10>11);//prints false
        System.out.println(10 != 50);//prints true
        System.out.println(10>=9);//prints true
        System.out.println(10<=9);//prints false
        System.out.println(10==11);//prints false
        //System.out.println(10==true);//NOT OK, incompatible type int and boolean
        System.out.println(10 == 'a');//prints false
        System.out.println(10 == 1.2e2);//prints false
        System.out.println(10 == 10.0);//prints true
        //System.out.println(10 == "true");//NOT OK, incompatible type int and string
        Object o = new Object();
        o = 10;
        //System.out.println(10==obj);//NOT OK, incompatible type int and object
        
        /* Assignment Operator */
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        o1 = 2; o2 = 3; o3 = 3;//assignment
        
        //equals operator and the (.) dot operator
        System.out.println(o1.equals(o2));//prints false
        System.out.println(o2.equals(o3));//prints true
        //instanceof operator
        System.out.println(o1 instanceof Number);//prints true
        System.out.println(o1 instanceof String);//prints false 
        
        /* Compound assignment, Binary operators */
        int q=2,r=3;
        r += q;
        System.out.println(r);//prints 5
        r-= q;
        System.out.println(r);//prints 3
        r*= q;
        System.out.println(r);//prints 6
        r/=q;
        System.out.println(r);//prints 3
        r%=q;
        System.out.println(r);//prints 1
        r>>=q;
        System.out.println(r);//prints 0
        r<<=q;
        System.out.println(r);//prints 0
        r>>>=q;
        System.out.println(r);//prints 0
        r&=q;
        System.out.println(r);//prints 0
        r|=q;
        System.out.println(r);//prints 2
        r^=q;
        System.out.println(r);//prints 0
        
        /*Lambda operator ->  */
        Arithmetic add =  (m,n)-> m + n;//created an arithmetic interface
        System.out.println(add.function(4,5));//prints 9
        
        /* diamond operator <> and toString() */
        ArrayList<Integer> list = new ArrayList();
        list.add(5);
        System.out.println(list.toString());//prints [5]
        }catch(Exception e){
            
        }
    }
    
}
interface Arithmetic {//Functional Interface used for lambda operator
	int function(int m, int n);
}
