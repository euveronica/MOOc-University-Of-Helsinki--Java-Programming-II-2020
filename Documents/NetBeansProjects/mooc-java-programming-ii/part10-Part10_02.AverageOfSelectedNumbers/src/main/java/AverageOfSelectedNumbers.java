
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne

        List<String> input = new ArrayList<>();
        
        
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
        
            String value = scanner.nextLine();
            if (value.equals("end")){
            break;
            }
            input.add(value);
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        
        String option = scanner.nextLine();
       double average =0.0;
        if (option.equals("n")){
            average = input.stream()
                    .mapToInt(r -> Integer.valueOf(r))
                    .filter(number -> number<0)
                    .average()
                    .getAsDouble();
        }
        else {
        
            average = input.stream()
                    .mapToInt(r -> Integer.valueOf(r))
                    .filter(number -> number>0)
                    .average()
                    .getAsDouble();
        }
      
        System.out.println("Average of the positive numbers: " + average);

    }
}