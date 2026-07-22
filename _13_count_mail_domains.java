
package basic;

import java.util.Scanner;

public class _13_count_mail_domains {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] domain = new String[n];
        int[] count = new int[n];
        int size = 0;

        System.out.println("Enter Email Addresses:");

        for (int i = 0; i < n; i++) {

            String email = sc.nextLine();

            int index = email.indexOf('@');
            String emailDomain = email.substring(index + 1);

            boolean found = false;

            for (int j = 0; j < size; j++) {

                if (domain[j].equals(emailDomain)) {
                    count[j]++;
                    found = true;
                    break;
                }
            }

            if (!found) {
                domain[size] = emailDomain;
                count[size] = 1;
                size++;
            }
        }

        System.out.println("\nDomain Count:");

        for (int i = 0; i < size; i++) {
            System.out.println(domain[i] + " : " + count[i]);
        }

        sc.close();
    }
}