/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.

 */

public class Answer3 {
    int a = 20;
    static int b =30;

    public void london(){
        System.out.println(a+b);
    }

    public static void bristol(){

        Answer3 mango = new Answer3();
        System.out.println(mango.a+b);

            }

    public static void main(String[] args) {
        bristol();
        Answer3 apple = new Answer3();
        apple.london();
    }
}


