/*
9. Write a program to convert the upper case to lower case.
 */

import java.util.Locale;
import java.util.Scanner;

public class Answer9 {

    public static void Answer9() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string to be converted to lowercase; ");
        String str = sc.nextLine();

        str = str.toLowerCase(Locale.ROOT); // convert string to lowercase
        System.out.println("String converted to Lowercase: "+ str);


            }

    public static void main(String[] args) {
        Answer9();


    }
}
