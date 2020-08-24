
import static java.lang.Math.ceil;
import static java.lang.Math.round;
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
public class Box implements Packable{

    private double capacity;
    private ArrayList<Packable> box;
    public Box(double capacity) {
            this.capacity = capacity;
            box = new ArrayList<>();
    }
    
    @Override
    public double weight() {
        double totalWeight = 0;
            for (Packable p: box){
               
                    totalWeight = totalWeight + p.weight();
            
            };
            
            return totalWeight;
    }
    
    public void add(Packable obj){
       
        if (weight() + obj.weight() <= capacity) {
                box.add(obj);
        }
        
        
    }
         
    @Override
    public String toString(){
        return "Box: "+ box.size() + " items, total weight " + ceil(weight()) + " kg";
    }
    
}
