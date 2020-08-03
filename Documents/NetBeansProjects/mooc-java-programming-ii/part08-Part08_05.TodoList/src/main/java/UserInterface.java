
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class UserInterface {
    
    private TodoList list = new TodoList();
    private Scanner scanner = new Scanner(System.in);
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    public void start(){
        while(true){System.out.print("Command: ");
        String s = scanner.nextLine();
        if (s.equals("add")){
                System.out.print("To add: ");
                String addList = scanner.nextLine();
                list.add(addList);
            } else if(s.equals("list")){
                list.print();
            } else if(s.equals("remove")){
                System.out.print("Which one is removed? ");
                int x = Integer.valueOf(scanner.nextLine());
                list.remove(x);
            } else if (s.equals("stop")){
                return;
            }
        }
            
    }
    
    
    
}
