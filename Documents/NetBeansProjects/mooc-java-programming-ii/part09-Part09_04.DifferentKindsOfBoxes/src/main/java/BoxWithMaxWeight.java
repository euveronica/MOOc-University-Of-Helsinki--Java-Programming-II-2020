
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
public class BoxWithMaxWeight extends Box {
    
    private ArrayList<Item> box;
    private int capacity;
    
    public BoxWithMaxWeight (int capacity) {
        this.capacity = capacity;
        box = new ArrayList<>();
    }
    
//    @Override
//    public void add(ArrayList<Item> items) {
//        
//        for (Item item : items) {
//            if (items.size()<this.capacity) {
//            BoxWithMaxWeight.this.add(item);
//            }
//        }
//    }

    
    @Override
    public void add(Item item) {
        
        int totalWeight = 0;
        
        for (Item i : box){
            totalWeight += i.getWeight();
        }
        
        if (capacity - totalWeight >=item.getWeight() ) {
            box.add(item);
            
        }       
    }
    
    
    @Override
    public boolean isInBox(Item item) {
        
        if (item == null) {
            return false;
        }
        else {
            for (Item b: box){
            if (b.equals(item)) {
            return true;
            }
            }
        }
        return false;
    }

}
