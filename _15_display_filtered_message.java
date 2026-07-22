package basic;

import java.util.Scanner;

public class _15_display_filtered_message {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the chat message: ");
        String message = sc.nextLine();

        System.out.print("Enter number of blocked words: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] blockedWords = new String[n];

        System.out.println("Enter blocked words:");

        for (int i = 0; i < n; i++) {
            blockedWords[i] = sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            message = message.replace(blockedWords[i], "****");
        }

        System.out.println("Filtered Message:");
        System.out.println(message);

        sc.close();
    }
}