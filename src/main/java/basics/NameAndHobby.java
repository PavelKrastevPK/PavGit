package basics;

import java.util.Scanner;

public class NameAndHobby {
    public static void main(String[] args) {


        System.out.println("Please enter your first and last name.");
        Scanner scanner = new Scanner(System.in);
        //name
        String firstAndLastName = scanner.nextLine();
        System.out.println("Please enter what is your hobby.");
        //hobby
        String hobby = scanner.nextLine();
        //age
        System.out.println("Please enter your age.");
        byte age = scanner.nextByte();

        System.out.println
                ("Your name is: " + firstAndLastName +
                        "\n" + "Your hobby is: " + hobby + "\n" +
                        "Your age is: " + age);
        if (age < 18) {
            System.out.println("You're under age for driving license.");
        }
        if (age >= 18 && age < 65) {
            System.out.println("Your driving license are going to be issued in 3 to 5 business days.");
        } else {
            System.out.println("Driving licence cannot be issued.");
        }

    }
}