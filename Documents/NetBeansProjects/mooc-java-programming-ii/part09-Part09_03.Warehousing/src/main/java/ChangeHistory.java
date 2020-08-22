
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class ChangeHistory {
    
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory(){
        changeHistory = new ArrayList();
    }
    
    public void add(double status) {
        changeHistory.add(status);
    }
    
    public void clear() {
        changeHistory.clear();
    }
    
    public double maxValue() {
    
    double result = 0.0;
    
    if (!changeHistory.isEmpty()){
    for (Double d : changeHistory){
        if (d > result) {
            result = d;
        }
    }
    }
    return result;
    
    }
    
    public double minValue() {
       double result = 0.0;
    
    if (!changeHistory.isEmpty()){
        result = changeHistory.get(0);
        //for (int i=0; i< changeHistory.size(); i++)
        
        for (Double d : changeHistory){
        if (d < result) {
            result = d;
        }
    }
    }
    return result;
    }
    
    public double average() {
    
      double sum = 0.0;
        
      if (!changeHistory.isEmpty()){
      for (Double d : changeHistory){
        sum += d;
      } }
      
      if (changeHistory.isEmpty()){
          return 0.0;
      }
      else return sum/changeHistory.size();
    }
    
    @Override
    public String toString(){
        return changeHistory.toString();
    }
}
