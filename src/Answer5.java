/*
5. Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)


 */


import java.util.Scanner;

public class Answer5 {

    public static double add(double num1, double num2) {

        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;

    }

    public double multiplication(double num1, double num2) {
        return num1 * num2;

    }

    public double divide(double num1, double num2) {
        return num1 / num2;

    }

    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = calc.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = calc.nextDouble();
        System.out.println("addition of 2 numbers: " + add(num1, num2));
        System.out.println("substraction of 2 numbers: " + sub(num1, num2));
        Answer5 dot = new Answer5();
        dot.multiplication(num1, num2);
        System.out.println("multiplication of 2 numbers: "+ dot.multiplication(num1,num2));
        System.out.println("Divition of 2 numbers: "+dot.divide(num1,num2));

    }


}


