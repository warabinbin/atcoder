import java.util.Scanner;
public class A_381 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        int mid = (N - 1) / 2;

        if (N % 2 == 0) {
            System.out.println("No");
            return;
        }
        
        if (S.charAt(mid) != '/') {
            System.out.println("No");
            return;
        }

        // 左半分がすべて '1'
        for (int i = 0; i < mid; i++) {
            if (S.charAt(i) != '1') {
                System.out.println("No");
                return;
            }
        }

        // 右半分がすべて '2'
        for (int i = mid + 1; i < N; i++) {
            if (S.charAt(i) != '2') {
                System.out.println("No");
                return;
            }
        }
        
        System.out.println("Yes");
    }
}