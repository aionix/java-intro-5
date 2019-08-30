package lesson03;

import java.util.ArrayList;
import java.util.Collections;
//1. В пакете lesson03 создать класс Fibonacci с методом printFibonacciNumbers, который выводит числа ряда Фибоначчи (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, ….) в консоль.
// Предусмотреть, чтоб количество выводимых чисел было параметром этого метода.
//        2. Вызвать метод в главном методе (main) и проверить его работу для разного количества чисел:
//        printFibonacciNumbers(-1) -> "Please enter a positive number more than 0";
//        printFibonacciNumbers(0) -> "Please enter a positive number more than 0";
//        printFibonacciNumbers(1) -> 0;
//        printFibonacciNumbers(4) -> 0, 1, 1, 2;
//        printFibonacciNumbers(7) -> 0, 1, 1, 2, 3, 5, 8/

public class Fibonacci {

    public static void main(String[] args){

        Fibonacci.printFibonacciNumbers(-1);
        Fibonacci.printFibonacciNumbers(0);
        Fibonacci.printFibonacciNumbers(1);
        Fibonacci.printFibonacciNumbers(4);
        Fibonacci.printFibonacciNumbers(7);
    }

    private static void printFibonacciNumbers(int maxNumber){
        ArrayList<Integer> array = new ArrayList<>();
        int firstNum = 0;
        int secondNum = 1;
        array.add(0);
        array.add(1);


        if (maxNumber <=0) {
            System.out.println("Please enter a positive number more than 0");
        } else {

            for ( int i = 0; i < maxNumber; i++){
                int sum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = sum;
                array.add(sum);
            }
            String str = array.subList(0, maxNumber).toString();
            System.out.println(str.substring(1, str.length()-1));

        }
    }
}
