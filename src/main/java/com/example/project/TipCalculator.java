package com.example.project;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip(
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here
        double totalTip = (cost*(0.01*percent));
        double totalBill = cost + totalTip;
        double billPerson = cost/people;
        double tipPerson = totalTip/people;
        double totalPerson = billPerson + tipPerson;


        totalTip = (Math.round(totalTip*100.0) / 100.0);
        totalBill = (Math.round(totalBill*100.0) / 100.0);
        billPerson = (Math.round(billPerson*100.0) / 100.0);
        tipPerson = (Math.round(tipPerson*100.0) / 100.0);
        totalPerson = (Math.round(totalPerson*100.0) / 100.0);

        

        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("\n");
        result.append("Total percentage: " + percent + "%");
        result.append("\n");
        result.append("Total tip: $" + totalTip);
        result.append("\n");
        result.append("Total Bill with tip: $" + totalBill);
        result.append("\n");
        result.append("Per person cost before tip: $" + billPerson);
        result.append("\n");
        result.append("Tip per person: $" + tipPerson);
        result.append("\n");
        result.append("Total cost per person: $" + totalPerson);
        result.append("\n");
        result.append("-------------------------------\n");


        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 6; 
        int percent = 25;
        double cost = 52.27;
        System.out.println(calculateTip(people, percent, cost));
    }
}
        
// SOURCES:
  // learned how to use Math.round from:  https://www.educative.io/answers/how-to-use-the-java-mathround-method
  // String format and Decimal format:  https://stackoverflow.com/questions/153724/how-to-round-a-number-to-n-decimal-places-in-java