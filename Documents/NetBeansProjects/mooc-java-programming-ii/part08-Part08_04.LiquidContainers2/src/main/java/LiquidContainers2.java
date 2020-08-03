
import java.util.Scanner;

public class LiquidContainers2 {
    int amount;
    
    public int contains() {
        return amount;
    }
    
    public void add(int amount) {
        if (amount>0){
        this.amount += amount;
        }
     
        if (this.amount > 100) {
            this.amount =100;
        }
    }
    
    public void remove(int amount) {
        
        if (amount > 0) {
                this.amount -=  amount;
                if (this.amount < 0) {
                    this.amount= 0;
                }
    }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LiquidContainers2 container1 = new LiquidContainers2();
        LiquidContainers2 container2 = new LiquidContainers2();
        
        while (true) {
            System.out.println("First: " + container1.amount + "/100");
            System.out.println("Second: " + container2.amount + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] partsOfInput = input.split(" ");
            input = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);
 
            if (input.equals("add") ) {
                container1.add(amount);
            }
 
            if (input.equals("move")) {
                 if (amount > container1.amount) {
                    amount = container1.amount;
                }
                container1.remove(amount);
                container2.add(amount);
            }
 
            if (input.equals("remove")) {
                container2.remove(amount);
            }
 
            System.out.println("");
        }
    }

}
