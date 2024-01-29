import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine(); // Consume the newline
        String s = sc.nextLine();
        Set<Character> st = new HashSet<>();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st.add(s.charAt(i));
            if (st.size() == k) {
                ans.append(s.charAt(i));
                st.clear();
            }
        }
        if (ans.length() >= n) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
            char miss = ' ';
            for (int i = 0; i < k; i++) {
                char ch = (char) ('a' + i);
                if (!st.contains(ch)) {
                    miss = ch;
                }
            }
            while (ans.length() < n) {
                ans.append(miss);
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) solve();
    }
}


