import java.util.Scanner;

public class C_380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        int countR = 0, count = 0; // R：制約条件

        // 制約条件
        if (N < 1 || N > 500000)
            return;
        if (K < 2)
            return;
        if (S.length() != N)
            return;
        for (char cR : S.toCharArray()) {
            if (cR == '1')
                countR++;
            else if (cR != '0' && cR != '1')
                return;
        }
        if (countR < K)
            return;

        // ロジック：マルコフ連鎖的なのでいけるはず。。。c[N]=1, c[N+1]=0 あしたやる
        // （例）N:15 K:3 S:010011100011001 out:010011111000001
        for (char c : S.toCharArray()) {
            if (c == '1') {

            }
        }

        // 出力

    }
}
