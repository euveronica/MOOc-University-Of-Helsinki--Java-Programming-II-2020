
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        int count = 0;

        while (true) {
            int x = scanner.nextInt();
            if (x == 0) {
                break;
            }
            if (x > 0) {
                count++;
                sum += x;
            }
        }

        if (count > 0) {
            System.out.println(sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}
