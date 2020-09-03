
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        List<Integer> inputs = new ArrayList<>();

         while (true) {
             Integer number = scanner.nextInt();
             if (number<0) {
                break;
             }

          inputs.add(number);
        }
         
         inputs.stream()
                 .filter(n -> n>0 && n<6)
                 .forEach(i -> System.out.println(i));
    }
    
}
