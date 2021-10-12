/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Answer4 {

    int a = 5;
    int b = 10;
    static String name = "Bombay";
    static String name1 = "Delhi";

 //Instance
    public void london() {
        System.out.println(a);
        System.out.println(b);

        System.out.println(Answer4.name);
        System.out.println(Answer4.name1);

    }
    //Static

        public static void myStatic(){
            System.out.println("");
            Answer4 y2 = new Answer4();
            System.out.println(y2.a);
            System.out.println(y2.b);

            System.out.print(name+ "  "+ name1);
           // System.out.println(name1);

        }
            public static void main(String[] args) {
                Answer4 obj = new Answer4();
                obj.london();
                myStatic();

            }

        }





