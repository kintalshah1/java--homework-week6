/*

13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */


import java.util.Scanner;

public class Answer13 {

    public static double average(double a,double b,double c){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First number= ");
        a= scan.nextDouble();
        System.out.print("Enter Second number= ");
        b= scan.nextDouble();
        System.out.print("Enter Third number= ");
        c= scan.nextDouble();

        double result = (a+b+c)/3;

        System.out.println("The average of Three numbers is: " + result);
        return result;


    }

    public static void main(String[] args) {

        average(10,20,30);

    }


}
