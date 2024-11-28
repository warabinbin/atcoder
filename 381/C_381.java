import java.util.Scanner;

public class C_381 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int len = input.nextInt();
        input.nextLine();
        String word = input.nextLine();

        int max = 0;
        for (int i = 0; i < len; i++) {
            if (word.charAt(i) == '/') {
                max = Math.max(max, find(word, i));
            }
        }

        System.out.println(max);
    }

    public static int find(String word, int start) {
        int left = start - 1, right = start + 1;
        while (left >= 0 && right < word.length()) {
            if (word.charAt(left) == '1' && word.charAt(right) == '2') {
                left--;
                right++;
            } else
                break;
        }
        return right - left - 1;
    }
}
