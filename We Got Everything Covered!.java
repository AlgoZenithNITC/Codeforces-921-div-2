import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < k; j++) {
                    ans.append((char) ('a' + j));
                }
            }
            System.out.println(ans.toString());
        }
        scanner.close();
    }
}

