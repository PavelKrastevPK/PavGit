package basics.training;

import java.util.Random;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
//1
        if (name.trim().isEmpty()) {
            System.out.println("Please enter a valid name");
        } else {
            System.out.println("Your name is: " + name);
        }
//2
        String a = randomThreeLetters();
        String b = randomThreeLetters();
        String testString = ("Your first random string is: '"
                + a + "' and the second one is: '" + b + "'" + "\nThey are equals -" + a.equals(b));
        System.out.println(testString);

        String removeSpace = testString.replace(" ", "");
//3
        System.out.println("This is how many letters we have in our string: " + removeSpace.length());
//4
        System.out.println(a + b);
    }

    private static String randomThreeLetters() {
        String alphabet = "AB1";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        int length = 3;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            stringBuilder.append(randomChar);
        }
        return stringBuilder.toString();
    }
}
