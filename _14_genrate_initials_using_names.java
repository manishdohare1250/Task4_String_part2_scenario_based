package basic;

import java.util.Scanner;

import java.util.Scanner;

public class _14_genrate_initials_using_names {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Full Name: ");
        String name = sc.nextLine();

        // Print first initial
        System.out.print(Character.toUpperCase(name.charAt(0)));

        // Print remaining initials
        for (int i = 0; i < name.length(); i++) {

            if (name.charAt(i) == ' ' && i + 1 < name.length()) {
                System.out.print("." + Character.toUpperCase(name.charAt(i + 1)));
            }
        }

        sc.close();
    }
}