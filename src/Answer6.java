/*
6. Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r)
 */


import java.util.Scanner;

public class Answer6 {

    public static void main(String[] args) {

        Answer6 obj = new Answer6();
        obj.AreaOfCircle();

            }

            public void AreaOfCircle(){

                Scanner s = new Scanner(System.in);
                System.out.println("Enter the radius");
                double r = s.nextDouble();
                double area =(22*r*r)/7;
                System.out.println("Area of the Circle;"+area);


            }
}
