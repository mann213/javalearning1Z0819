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

public class Wrapper_2_5 {
    //wrappers are used to wrap primitve datatypes into objects, so that they have a behaviour
    public static void main(String[] args){
        
        /* CHARACTER WRAPPER */
        char c = 'c';
        //Character c = new Character('c');//OK, but deprecated as of Java 9
        Character c1 = Character.valueOf(c);
        Character c2 = Character.valueOf(c);
        int comparechar = c1.compareTo(c2);//objects can use methods
        System.out.println("Both characters are compared to "+comparechar);//prints 0 means equal
        
        /* BOOLEAN WRAPPER */
        boolean b = true;
        //Boolean b = new Boolean(true);//OK, but deprecated as of Java 9
        Boolean b1 = Boolean.valueOf(b);
        Boolean b2 = Boolean.valueOf(b);
        int comparebool = c1.compareTo(c2);//objects can use methods
        System.out.println("Both boolean are compared to "+comparebool);//prints 0 means equal
        System.out.println(b1.equals(b2));//prints true
        
        /* BYTE WRAPPERS */
        byte byte1 = -127; 
        byte byte2 = 126;
        Byte by1 = Byte.valueOf(byte1);//ok
        Byte by2 = Byte.valueOf(byte2);//ok
        int comparebyte = by1.compareTo(by2);//objects can use methods
        System.out.println("Both bytes are compared to "+comparebyte);//prints -253 means not equal, by1 < by2
        System.out.println(by1.equals(by2));//prints false
        
        /* INTEGER WRAPPERS */
        String str2 = "4";
        System.out.println(Integer.getInteger(str2));
        Integer int1 = Integer.max(2, 4);
        Integer int2 = Integer.min(2, 4);
        int compareint1 = int1.compareTo(int2);//objects can use methods
        System.out.println("Both ints are compared to "+compareint1);//prints 1 means not equal, int1 > int2
        System.out.println(int1.equals(int2));//prints false
        
        Integer i1 = Integer.valueOf(-2127);//OK
        Integer i2 = Integer.valueOf(-1128);//OK
        int compareint2 = i1.compareTo(i2);//objects can use methods
        System.out.println("Both ints are compared to "+compareint2);//prints -1 means not equal, i1 < i2
        System.out.println(i1.equals(i2));//prints false
        
        /* FLOAT WRAPPERS */
        Float f1 = Float.valueOf(-212.7F);//OK
        Float f2 = Float.valueOf(-11.28F);//OK
        int comparefloat = f1.compareTo(f2);//objects can use methods
        System.out.println("Both floats are compared to "+comparefloat);//prints -1 means not equal, f1 < f2
        System.out.println(f1.equals(f2));//prints false
        
        /* DOUBLE WRAPPERS */
        Double d1 = Double.valueOf(-22.47);//OK
        Double d2 = Double.valueOf(-101.128);//OK
        int comparedouble = d1.compareTo(d2);//objects can use methods
        System.out.println("Both doubles are compared to "+comparedouble);//prints 1 means not equal, d1 > d2
        System.out.println(d1.equals(d2));//prints false
        
        /* SHORT WRAPPERS */
        short short1 = 21;
        short short2 = -67;
        //Short s1 = new Short(212.7);//NOT OK, double to short conversion is not possible
        Short s1 = Short.valueOf(short1);
        Short s2 = Short.valueOf(short2);//OK
        int compareshort = s1.compareTo(s2);//objects can use methods
        System.out.println("Both short are compared to "+compareshort);//prints 88 which is greater than 0 means not equal, l1 > l2
        System.out.println(s1.equals(s2));//prints false
        
        /* LONG WRAPPERS */
        long long1 = 21L;
        long long2 = -67L;
        //Long l1 = new Long(212.7L);//NOT OK, double to long conversion is not possible
        Long l1 = Long.valueOf(long1);
        Long l2 = Long.valueOf(long2);//OK
        int comparelong = l1.compareTo(l2);//objects can use methods
        System.out.println("Both longs are compared to "+comparelong);//prints 1 means not equal, l1 > l2
        System.out.println(l1.equals(l2));//prints false
    }
    
}
