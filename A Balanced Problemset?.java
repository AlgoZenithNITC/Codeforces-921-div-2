import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
        scanner.close();
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int ans = 1;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                int z1 = (n / i);
                if (z1 >= x) {
                    ans = Math.max(ans, i);
                }
                if (i >= x) {
                    ans = Math.max(ans, z1);
                }
            }
        }
        System.out.println(ans);
    }
}

