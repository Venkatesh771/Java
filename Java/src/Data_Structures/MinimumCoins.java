package Data_Structures;
import java.util.Scanner;

public class MinimumCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        findMinCoins(amount);
    }

    public static void findMinCoins(int amount) {
        int[] denominations = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        for (int denom : denominations) {
            while (amount >= denom) {
                amount -= denom;
                System.out.print(denom + " ");
            }
        }
    }
}
