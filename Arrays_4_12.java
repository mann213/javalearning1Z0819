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
import java.util.Arrays;
import java.util.ArrayList;
public class Arrays_4_12 {
     public static void main(String args[]){
         
        /* INITIALIZATION OF one dimensional ARRAY */ 
        int[] nullarray; //OK
        //for(int na:nullarray)System.out.print(na+ " ");//NOT OK, array not initialized
        int i1[] = {1,2,3};//OK
        byte[] bytearray = {127,126,125};
        //getClass of the array
        long[] longarray = {12L,26L};
        System.out.println(longarray.getClass());//print class [J] for Long
        String[] strarray = new String[3];
        strarray[0]="string1";
        strarray[1]="string2";
        strarray[2]="string3";
        //char[] ca = strarray.clone();NOT OK, String cannot be converted to char
        //int[] a0 = new int[]//NOT OK
        int[] a0 = new int[2];//OK
        for(int ai:a0)System.out.print(ai+ " ");//prints 0 0 and not null
        System.out.println();
        //int[2] b0 = new int[];//NOT OK
        int[] b0 = {1,2};
        //cloning of arrays
        a0 = b0.clone();
        System.out.println(a0[0]);//prints 1
               
        String[] s0 = new String[2];
        for(String si:s0)System.out.print(si+ " ");//prints null null 
        System.out.println();
        
        Object[] o0 = new String[2];
        for(Object oi:o0)System.out.print(oi+ " ");//prints null null 
        System.out.println();
        
        /* INITIALIZATION OF two dimensional ARRAY */ 
        int a[][] = {{1,2,3},{2,3,4,5}};//OK
        int[] a3[] = {{2,3,2},{3,4,5}};//OK, called as symmetric array
        //int[] a1 = new int[]{1,3}{2,4};//NOT OK, 1-D array cannot be initialized to 2-D array
        int a2[] = new int[]{1,2,3}; //OK 1-D array
        for(int ai2:a2)System.out.print(ai2+ " ");//prints 1 2 3 
        System.out.println();
        int[][] a4 = {{3,7},{5,9,3}};//OK, called as 2-D jagged arrays
        //int[][] a5 = new int[][];//NOT OK, size not given
        //int[] a5 = new int[]{{1,3},{3}};// NOT OK, will not compile
        //int a5[] = new int[]{{1,2,3},{4,5}}; //NOT OK, 1-D array cannot be initialized to 2-D array
        //int a5[5] = {1,2,3,4,5};//NOT OK,  both dimension expression and initialization cannot coexist
        //int[5] a5 = {1,2,3,4,5};//NOT OK,
        //int a5[] = new int[5]{1,2,3,4,5};//NOT OK
        //int[2][2] a5 = {{8,7},{6,7}};//NOT OK
        //int[] a5 = new a5[2]{1,2}; NOT OK
        int a5[][] = new int[5][2];//OK
        a5[0][0] = 00;
        a5[0][1] = 01;
        a5[1][0] = 10;
        a5[1][1] = 11;
        a5[2][0] = 20;
        a5[2][1] = 21;
        a5[3][0] = 30;
        a5[3][1] = 31;
        a5[4][0] = 40;
        a5[4][1] = 41;
        //to print this array
        for(int[] aa : a5){
            for(int aaa : aa)
            System.out.println(aaa);//prints each element of array a5 (2D array)
        }
        System.out.println(a5.length); //prints 5
        int[][] a6 = new int[2][];//OK
        
        boolean[] bool = new boolean[]{true, false};
        System.out.println(bool.getClass());//prints class [Z]
        
        Object[][] obj = new Object[2][2];
        obj[0][0] = "Object1";
        obj[1][0] = "Object2";
        for(Object[] oa : obj){
            for(Object oaa : oa)
            System.out.print(oaa+" ");//prints: Object1 null Object2 null 
        }
        System.out.println();
        
        System.out.println(obj.getClass());//prints class [L java.lang.Object]
        System.out.println(a5.equals(obj));//prints false
        
        Number[] n1 = {1,1.2F,987.87,54};//OK, due to covariance, float and int belong to Number 
        //Number[] n2 = {1.1L}//NOT OK , Long does not belong to Number 
        //Cloning of arrays
        Number[] n2 = n1.clone();
        for(Number num:n2)
        System.out.print(num+ " "); //prints 1 1.2 987.87 54 
        //Long[] n3 = n2.clone();//NOT OK, Number cannot converted to long
        System.out.println();
        
        char[] chararray1 = {'a','e','i','o','u'};
        char[] chararray2 = new char[3];
        //array copy
        System.arraycopy(chararray1,0,chararray2, 1, 2);//0 index and 1 index both inclusive, 2 is length
        for(char ca2 : chararray2)System.out.print(ca2+ " "); //prints [  a e    ]
        System.out.println();
        
        //int sortedarray[] = new int[9];
        int[] intarray = {9,2,3};
        Arrays.parallelSort(intarray);//parallelsort is faster
        for(int sorted: intarray)System.out.print(sorted+ " ");//prints 2 3 9
        System.out.println(); 
        
        //binary search
        float[] floatarray = {3.14F,2.13F,3.8F};
        System.out.println(Arrays.binarySearch(floatarray, 1));//prints -1.0 , 1 does not exist
        System.out.println(Arrays.binarySearch(floatarray, 2.13F));//prints 1 , 2,13F exists ar index 1
        
        int[] intarray1 = {555, 432,987};
        Arrays.fill(intarray1, 10);
        for(int filled1: intarray1)System.out.print(filled1+ " ");//prints 10,10,10
        System.out.println();
        int[] intarray2 = {555, 432,987};
        Arrays.fill(intarray2, 1,2,2);// 1 index inclusive 2 index exclusive
        for(int filled2: intarray2)System.out.print(filled2+ " ");//prints 555,2,987
        System.out.println();
        int[] intarray3 = {555, 432,987};
        Arrays.fill(intarray3, 0,2,2);//0 index inclusive 2 index exclusive
        for(int filled3: intarray3)System.out.print(filled3+ " ");//prints 2,2,987
        System.out.println();
        System.out.println(Arrays.deepToString(o0));//prints [null, null]
        
        double[] doublearray = {78.89,566.788,5677.234};
        double printdouble[] = Arrays.copyOfRange(doublearray, 0, 2);//0 index inclusive index 2 exclusive
        for(double copied: printdouble)System.out.print(copied+ " ");//prints 78.89 566.788 
        
        Object object = longarray;//OK, array is an object
        //for(Object copied: object)System.out.print(copied+ " ");//NOT OK , need an iterable type
        //Object[] objarray = longarray; //NOT OK, long cannot be converted to object array
        Object[] objarray = new int[2][2];//OK,  array is object in an object array
        for(Object arrayasobj: objarray)System.out.print(arrayasobj+ " ");//prints objects [I@816f27d [I@87aac27
        System.out.println();
     }
}
