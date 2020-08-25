
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
public class Herd implements Movable {

    private List<Movable> herd;
    
    public Herd(){
        herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        herd.add(movable);
    }
    
    @Override
    public void move(int dx, int dy) {
        for (Movable m : herd) {
            m.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
       String result ="";
            for (Movable x : herd){
                result += x.toString() + "\n";
            }
        
        return result;
    }
}
