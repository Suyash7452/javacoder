package com.suyash;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//simple calculator java code
        double num1,num2;
        char operater ;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number =");
        num1=scanner.nextDouble();
        System.out.println("enter mathamatical symbols (+,-,*,/)");
        operater=scanner.next().charAt(0);


        System.out.println("Enter second number =");
        num2=scanner.nextDouble();
        switch (operater){
            case '+':
                System.out.println("Addition of two element:: "+(num1+num2));
                break;
            case '-':
                System.out.println("subtraction  of two element:: "+ (num1-num2));
                break;
            case '*':
                System.out.println("multiplication  of two element:: "+ (num1*num2));
                break;
            case '/':
                System.out.println("multiplication  of two element:: "+ (num1/num2));
                break;
            default:
                System.out.println("please select valid operator..");
        }


    }
}
