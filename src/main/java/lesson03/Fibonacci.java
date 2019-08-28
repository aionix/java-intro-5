package lesson03;

import java.util.ArrayList;

public class Fibonacci {

    public static void main(String[] args){
        Fibonacci.printFibonacciNumbers(10);
    }

    private static void printFibonacciNumbers(int maxNumber){
        String allNumbers;
        int firstNum = 0;
        int secondNum = 1;

        if (maxNumber <=0) {
            System.out.println("Please enter a positive number more than 0");
        } else {
            for ( int i = 0; i <= maxNumber; i++){
                int sum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sum;
                allNumbers = String.valueOf(sum) + " ";
                System.out.print(allNumbers);
            }
        }
    }
}
