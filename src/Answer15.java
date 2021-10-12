/*
15. Write a Java program to swap two variables.

 */

public class Answer15 {
    public static void main(String[] args) {

        swap();
    }

    public static void swap(){

        int a = 10;
        int b = 20;
        int c;


        // Before swapping
        System.out.println(a);
        System.out.println(b);

        c=a;
        a=b;
        a=c;
        // After Swapping
        System.out.println(a);
        System.out.println(b);

    }
}


