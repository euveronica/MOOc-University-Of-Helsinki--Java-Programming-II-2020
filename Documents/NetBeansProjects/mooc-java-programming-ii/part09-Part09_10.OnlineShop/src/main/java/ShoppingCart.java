
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class ShoppingCart {
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        for (String s : cart.keySet()){
            if (s.equals(product)){
                cart.get(s).increaseQuantity();
                return;
            }
        }
        
        cart.put(product, new Item(product, 1, price));   
    }
    
    public int price(){
        int totalPrice = 0;
        for (Item s : cart.values()){
            totalPrice += s.price();
        }
        
        return totalPrice;
    }
    
    public void print(){
         for (Item s : cart.values()){
             System.out.println(s);
        }
    }
}
