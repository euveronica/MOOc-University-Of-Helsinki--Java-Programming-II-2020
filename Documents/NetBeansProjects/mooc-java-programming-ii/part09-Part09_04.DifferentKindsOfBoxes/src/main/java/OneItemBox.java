
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
public class OneItemBox extends Box {

     private ArrayList<Item> oneItemBox;
    
    public OneItemBox(){
        oneItemBox = new ArrayList<>(1);
        
    }
    @Override
    public void add(Item item) {
         
        if (oneItemBox.size() == 1 ) {
            return;
        }   
        else oneItemBox.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        if ((item == null) || (oneItemBox.size() == 0)) {
            return false;
        }
        else {
            
            if (oneItemBox.get(0).equals(item)) {
            return true;
            }
            }
        return false;
        
    }
    
}
