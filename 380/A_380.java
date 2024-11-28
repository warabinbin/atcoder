import java.util.Scanner;

public class A_380 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String number = String.valueOf(N);
        int count1 = 0, count2 = 0, count3 = 0;

        // 制約
        if (N < 100000 || N > 999999) {
            System.out.println("No");
            return;
        }

        for (char c : number.toCharArray()) {
            if (c == '1')
                count1++;
            else if (c == '2')
                count2++;
            else if (c == '3')
                count3++;
        }

        // 条件を判定
        if (count1 == 1 && count2 == 2 && count3 == 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
