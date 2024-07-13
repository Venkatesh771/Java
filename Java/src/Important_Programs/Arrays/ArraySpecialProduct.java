package Important_Programs.Arrays;
import java.util.Scanner;
public class ArraySpecialProduct {
    public static int[] findSpecialProduct(int[] input) {
        int n = input.length;
        int[] result = new int[n];

        if (n == 0) {
            return result;
        }

        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];

        leftProduct[0] = 1;
        rightProduct[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            leftProduct[i] = leftProduct[i - 1] * input[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * input[i + 1];
        }

        for (int i = 0; i < n; i++) {
            result[i] = leftProduct[i] * rightProduct[i];
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = scanner.nextInt();
        }

        int[] result = findSpecialProduct(input);

        for (int value : result) {
            System.out.println(value);
        }
    }
}
