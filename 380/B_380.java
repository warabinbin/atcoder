import java.util.ArrayList;
import java.util.Scanner;

public class B_380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        ArrayList<Integer> ans = new ArrayList<>();
        int count = 0; // `-` のカウント

        // 制約
        if (S.length() < 3 || S.length() > 100) {
            return;
        }

        // ---を数えるロジック （例）|----|--| → |4|2|
        for (char c : S.toCharArray()) {
            if (c == '-') {
                count++;
            } else if (c == '|') {
                if (count > 0) {
                    ans.add(count);
                    count = 0;
                }
            } else {
                throw new IllegalArgumentException("Invalid character in string S.");
            }
        }

        // 出力
        for (int i = 0; i < ans.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(ans.get(i));
        }
    }
}
