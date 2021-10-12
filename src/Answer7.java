/*
7. Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).


 */

import java.util.Scanner;

public class Answer7 {


    public static void main(String[] args) {
        temperature();

            }

    public static void temperature() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Fahrenheit value; ");
        int f = s.nextInt();
        int celcius = ((5*(f-32))/9);
        System.out.println(f+ " Degree of Fahrenhite is equal to" + celcius + "in Celcius");


    }

}
