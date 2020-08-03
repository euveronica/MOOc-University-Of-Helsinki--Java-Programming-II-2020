
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class TodoList {
    
    private ArrayList<String> list = new ArrayList<>();
    //String[] s;
    
    public TodoList(){
        
    }    
    
    public void add(String task){
        list.add(task);
    }
    public void print(){
        for (String s:list){
            String listItem = (list.indexOf(s)+1) +": " + s;
            System.out.println(listItem);
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }
}
