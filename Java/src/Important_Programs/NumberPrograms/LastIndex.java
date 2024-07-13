package Important_Programs.NumberPrograms;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < T; i++) {
            String S = scanner.nextLine();
            int lastIndex = S.lastIndexOf('1');
            System.out.println(lastIndex);
        }
    }
}
