import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "yes";
        String name = "";


            do {
                System.out.println("Please enter your name:");
                name = scan.nextLine();

                System.out.print("Hello " + name + "!" + " Enter a number between 1 and 100: ");
                double num = scan.nextDouble();
                scan.nextLine();

                if ((num > 0) && (num < 60) && (num % 2 != 0)) {
                    System.out.println(name + " you entered " + num + " which is an odd and less than 60");
                }
                else if ((num > 1) && (num < 26) && (num % 2 == 0)) {
                    System.out.println(name + " you entered " + num + "Even and less than 25");
                }
                else if ((num > 25) && (num < 61) && (num % 2 == 0)) {
                    System.out.println(name + " you entered " + num + "Even");
                }
                else if ((num > 60) && (num < 100) && (num % 2 == 0)) {
                    System.out.println(name + " you entered " + num + "Even");
                }
                else if ((num > 60) && (num < 100) && (num % 2 != 0)) {
                    System.out.println(name + " you entered " + num + " odd and over 60");
                }
                System.out.println( name + " do you want to continue? (Yes/No)");
                answer = scan.nextLine();

            } while (answer.equals("yes"));

    }
}
