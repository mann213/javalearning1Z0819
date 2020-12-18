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
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.function.Function;
import java.util.function.Predicate;

import java.util.ArrayList;
public class LambdaExpressions_9_5 {
    public static void main(String args[]){
        //Consumer
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(2);
        numbers.add(3);
        Consumer<Integer> print = (x)-> System.out.println(x);
        numbers.forEach(print);
        
    }
    
}
