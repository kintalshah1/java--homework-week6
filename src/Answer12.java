/*
12. Write a Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

public class Answer12 {

    public static void compute(){

        double a =25.5;
        double b= 3.5;
        double c =40.5;
        double d =4.5;

        System.out.println("Test data: (25.5 * 3.5-3.5*3.5) / (40.5 - 4.5))");
        System.out.println("Expected Output: "+((a*b)- (b*b))/ (c-d));



    }

    public static void main(String[] args) {

        compute();

    }
}
