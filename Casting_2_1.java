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
public class Casting_2_1 {
    public static void main(String[] args){
        byte b_notinitialized;// primitive types are not initialized by default
        byte b = 127; //8-bit, -128 to 127 OK
        char c1 = '*';//[a-z][A-Z][!,@,#,$,%,^,&,*,(,),-,_,...etc
        char c2 = '\u0067';//OK, 16-bit
        short s = 12345; //16 bit
        //int i = 1234567890987654321;//not OK int too long
        int i = 123456789;
        //long l = 991234567890; NOT OK, int too large
        long l = 991234567890L;//OK, 64 bit
        //float f = 123.123;// NOT OK, incompatible types double to float
        float f = 123.123f; //OK, 32-bit
        double d = 12345.12345;// OK 64-bit
        boolean bool = true;//1-bit
        System.out.println("***INITIALIZED VALUES***");
           //System.out.println("byte ="+ b_notinitialized);//NOT OK, primitive types not initialized, compile time error
           System.out.println("byte b="+b);
           System.out.println("short s="+s);
           System.out.println("int i="+i);
           System.out.println("long l="+l);
           System.out.println("float f="+f);
           System.out.println("double d="+d);
           System.out.println("boolean bool="+bool);
           System.out.println("char c1="+c1);
           System.out.println("char c2="+c2);//prints g
        
        //Casting operator ()
        int inttocast=123;
        
        //b = inttocast;//NOT OK
        byte b1 = (byte)inttocast;// OK, casting required, int to byte
        System.out.println("***VALUES ON CASTING***");
        System.out.println("byte b1="+b1);//prints 123
        
        short s1 = b;//OK, implicit casting, byte to short
        short s2 = (byte)b;//OK, explicit casting not required but given
        System.out.println("short s1="+s1);//prints 127
        System.out.println("short s2="+s2); //prints 127
        
        int i1 = s; //OK, implicit casting, short to int
        int i2 = (int)s;//OK, explicit casting not required but given
        System.out.println("int i1="+i1);//prints 12345
        System.out.println("int i2="+i2);//prints 12345
        
        float f1 = i;//  OK implicit casting, int to float 
        float f2 = (float)i;//OK, explicit casting not required but given
        System.out.println("float f1="+f1);//prints 1.23456792E8
        System.out.println("float f2="+f2);//prints 1.23456792E8
        
        //long l1 = f;//NOT OK, incompatible types
        long l1 = (long)f;//OK, explicit casting required
        //long l2 = d;//NOT OK, incompatible types
        long l2 = (long)d;//OK, explicit casting required
        System.out.println("long l1="+l1);//prints 123
        System.out.println("long l2="+l2);//prints 12345
        
        double d1 = i;//OK, implicit conversions
        double d2 = s;//OK
        double d3 = b;//OK
        double d4 = f;//OK
        double d5 = l;//OK
        System.out.println("double d1="+d1);//prints 1.23456789E8
        System.out.println("double d2="+d2);//prints 12345.0
        System.out.println("double d3="+d3);//prints 127.0
        System.out.println("double d4="+d4);//prints 123.12300109863281
        System.out.println("double d5="+d5);//prints 9.9123456789E11
       
        System.out.println("***Casting may cause loss of data***"); 
        System.out.println("***when converting from large to small values***"); 
        byte b3 = (byte)129;//OK compile time, NOT OK runtime, prints 127 at runtime, explicit casting, loss of data
        short s3 = (short)123456;//OK compile time, but NOT OK runtime,  prints unexpected value like -7616 
        System.out.println("byte b3="+b3);//prints 127
        System.out.println("short s3="+s3);//prints -7616
          
        //int i3 = bool;//NOT OK, boolean cannot be converted to int
        //int i4 = (boolean)bool;//NOT OK, boolean cannot be converted to int
        char c3 = c2; //OK 
        System.out.println("char c3="+c3);//prints g
        //String is non-primitive type data
        //String str = (String)c3;//not ok
        //String str = c3;// NOT OK, char cannot b converted to string
        String str = Character.toString(c3);//OK
        System.out.println("str ="+str);//prints g
       
        Object obj = "String Object";
        //String string1 = obj;//NOT OK incompatible types
        String string1 = (String)obj;//explicit casting required
        System.out.println("Object casted to string '"+string1+"'");//prints Object casted to string 'String Object'
        
    }
    
    
}
