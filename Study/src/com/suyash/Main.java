package com.suyash;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
/*        List<Integer> l1=Arrays.asList(1,4,55,76,89,78);
        Collections.sort(l1,Collections.reverseOrder());
        l1.stream().collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(l1);
        System.out.println("Even  number from list ="+l1.stream().filter(s-> s%2==0).collect(Collectors.toList()));
        System.out.println(l1.stream().skip(2).limit(3).collect(Collectors.toList()));
        System.out.println(l1.stream().count());
        System.out.println(l1.stream().max(Integer::compareTo).get());*/

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
                System.out.println("Addition of two element:: "+ (num1-num2));
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("please select valid operator..");
        }


    }
}
