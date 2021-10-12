/*
9. Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Answer9 {

    public static void uppertolower() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be converted to Uppercase ");
        String str = sc.nextLine();

        str = str.toUpperCase(); // convert string to uppercase
        System.out.println("String converted to Uppercase:"+str);


            }

    public static void main(String[] args) {
        uppertolower();


    }
}
