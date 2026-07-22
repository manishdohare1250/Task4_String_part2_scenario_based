
package basic;

import java.util.Scanner;

public class _16_Content_management_system {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the article:");
        String article = sc.nextLine();

        // Total characters
        int totalCharacters = article.length();

        // Split into words
        String[] words = article.split(" ");

        int totalWords = words.length;

        String longestWord = words[0];
        String shortestWord = words[0];

        int totalWordLength = 0;

        for (int i = 0; i < words.length; i++) {

            totalWordLength += words[i].length();

            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }

            if (words[i].length() < shortestWord.length()) {
                shortestWord = words[i];
            }
        }

        double averageLength = (double) totalWordLength / totalWords;

        System.out.println("\nArticle Analysis");
        System.out.println("---------------------------");
        System.out.println("Total Words        : " + totalWords);
        System.out.println("Total Characters   : " + totalCharacters);
        System.out.println("Longest Word       : " + longestWord);
        System.out.println("Shortest Word      : " + shortestWord);
        System.out.println("Average Word Length: " + averageLength);

        sc.close();
    }
}