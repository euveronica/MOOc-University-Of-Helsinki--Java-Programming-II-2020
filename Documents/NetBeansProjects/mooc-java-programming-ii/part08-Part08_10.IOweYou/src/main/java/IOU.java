
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class IOU {
    private HashMap<String, Double> persons;
    
    public IOU(){
        this.persons = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.persons.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
       return this.persons.getOrDefault(toWhom, 0.0);
    }
    
}
