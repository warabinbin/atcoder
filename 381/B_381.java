import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B_381 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S.length() % 2 == 1) {
            System.out.println("No");
            return;
        }

        if (!S.matches("[a-z]+")) {
            System.out.println("No");
            return;
        }

        for (int i = 0; i < S.length(); i += 2) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                System.out.println("No");
                return;
            }
        }

        // 重複確認
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : S.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (int count : charCount.values()) {
            if (count != 2) {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        System.out.println(charCount);
    }
}