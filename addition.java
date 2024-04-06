public class addition {

     public static String myname;

     public static void main(String[] args) {
          System.out.println("hello ");
          callMe();
          returnString("i am shubham");

     }

     public static void callMe() {
          int age = 5;
          if (age > 18) {
               System.out.println("license is valide");

          } else {
               System.out.println("license is invalide");

          }

     }

     public static String returnString(String input) {
          System.out.println(input);
          myname = input;
          return input;
     }
}
