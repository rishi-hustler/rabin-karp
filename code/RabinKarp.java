import java.util.Scanner;
// BY RISHI HUSTLER
public class RabinKarpMenuDriven {

    static final int d = 256; // number of characters
    static final int q = 101; // prime number for hashing

    // Rabin–Karp pattern search
    static void rabinKarpSearch(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        if (m > n) {
            System.out.println("Pattern length is greater than text length.");
            return;
        }

        int p = 0; // hash value for pattern
        int t = 0; // hash value for text window
        int h = 1;

        // h = pow(d, m-1) % q
        for (int i = 0; i < m - 1; i++)
            h = (h * d) % q;

        // Calculate initial hash values
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
        }

        boolean found = false;

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {

            // Check hash values
            if (p == t) {
                int j;
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }

                if (j == m) {
                    System.out.println("Pattern found at index: " + i);
                    found = true;
                }
            }

            // Calculate hash for next window
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % q;

                if (t < 0)
                    t += q;
            }
        }

        if (!found) {
            System.out.println("Pattern not found in the text.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- RABIN-KARP STRING MATCHING MENU ---");
            System.out.println("1. Search Pattern in Text");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String text = sc.nextLine();
                    System.out.print("Enter pattern: ");
                    String pattern = sc.nextLine();
                    rabinKarpSearch(text, pattern);
                    break;

                case 2:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
