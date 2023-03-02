import java.util.Scanner;
public class Main {
    String fullName;
    int age;
    String address;

    Scanner reader = new Scanner(System.in);

  System.out.println ("Please enter your full name:");
    fullName = reader.nextString();

  System.out.println("Now, please enter your age:");
    age = reader.nextLine();

  System.out.println("Now, please enter the Student's last name only:");
    address = reader.nextLine();

  reader.close();

    }

}