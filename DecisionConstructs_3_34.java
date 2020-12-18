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
 * Objective: Decisions constructs
 * 
 */
public class DecisionConstructs_3_34 {
    public static void main(String args[]){
        //if else-if else loop
        if(2>3)
            System.out.println("In the if construct");
        else if (2>4)
            System.out.println("In the else-if construct");
        else
            System.out.println("In the else construct");
        
        //Nested if-else
        if(5>0){
            if(3>1){
                System.out.println("Printing in Nested if");
            }
         }
        
        int selection1 = 5;
        switch(selection1){
            case 1: 
                System.out.println("Monday");
                break;
            case 2: 
                System.out.println("Tuesday");
                break;  
            case 3: 
                System.out.println("Wednesday");
                break; 
            case 4: 
                System.out.println("Thursday");
                break;    
            case 5: 
                System.out.println("Friday");
                break;    
            default:
                System.out.println("Not a workday");
                break;    
        }//prints "Friday"
        
        char selection2 = 'Y';
        switch(selection2){
            case 'Y': 
                System.out.println("Yes");
                break;
            case 'N': 
                System.out.println("No");
                break;  
            default:
                System.out.println("Not a valid Y/N");
                break;    
        }//prints "Yes"
        
        String selection3 = "This";
        switch(selection3){
            //case "This" //NOT OK
            case "This":
                System.out.println("This is selected");
                break;
            case "That":
                System.out.println("That is selected");
                break;  
            default:
                System.out.println("Not a valid input");
                break;    
        }//prints "This is selected"
        
        //switch without break;
        String selection = "M";
        switch(selection){
            case "M": 
                System.out.print("Mon ");
            case "T": 
                System.out.print("Tue ");
            case "W": 
                System.out.print("Wed ");
            case "Th": 
                System.out.print("Thu ");
            case "F":
                System.out.print("Fri ");
            default:
                System.out.print("Sat ");
                System.out.print("Sun ");
                   
        }//prints Mon Tue Wed Thu Fri Sat Sun
     System.out.println();
     
     //not OK for switch selection float, double and boolean
     int selection4 = 1;
     switch(selection4){
            case 1:
                System.out.println("This is true");
                break;
            case 0:
                System.out.println("That is false");
                break;  
            default:
                System.out.println("Not a valid input");
                break;    
        }//prints "This is true"
        
        var wd = WorkDays.FRIDAY;
        switch(wd){//not a fall through execution
            case MONDAY,TUESDAY,WEDNESDAY -> System.out.println("Mon Tue Wed");
            case THURSDAY, FRIDAY -> System.out.println("Thu Fri");
            default -> System.out.println("Sun Sat");
        }//prints Thu Fri
        
     //switch and lambda expression
        System.out.println(calculate("+",2,3));//prints 5.0
    }
    public static enum WorkDays{MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY}
    public static double calculate(String operator, double x, double y) {
        return switch (operator) {
        case "+" -> x + y;
        case "-" -> x - y;
        case "*" -> x * y;
        case "/" -> {
            if (y == 0) {
                throw new IllegalArgumentException("Can't divide by 0");
            }
            yield x / y;
        }
        default -> throw new IllegalArgumentException("Unknown operator '%s'"+operator);
        };
    }
    
    
}
