
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class Warehouse {
    private Map<String, Integer> warehousePrice;
     private Map<String, Integer> warehouseStock;
//    private String product;
//    private int price;
//    private int stock;
    
    public Warehouse(){
    warehousePrice = new HashMap<>();
    warehouseStock = new HashMap<>();

        //Map<String, Integer> warehouse = new HashMap<>();
        
    }
    public void addProduct(String product, int price, int stock){
        warehousePrice.put(product, price);
        warehouseStock.put(product, stock);
//        this.product = product;
//        this.price = price;
//        this.stock = stock;
       
        
    }
    
    public int price(String product){
        for (String s : warehousePrice.keySet()){
            if (s.equals(product)){
                return warehousePrice.get(s);
            } 
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String s : warehouseStock.keySet()){
            if (s.equals(product)){
                return warehouseStock.get(s);
            } 
        }
        return 0;
    }
    
    public boolean take(String product){
        int stock;
        for (String s : warehouseStock.keySet()){
            if (s.equals(product)){
               if (warehouseStock.get(s)>=1){
                   stock = warehouseStock.get(s) -1;
                   warehouseStock.put(product, stock);
                   return true;
               };
            } 
        }
               
        
        return false;
        
    }
    
    public Set<String> products(){
        Set<String> keys = warehousePrice.keySet();
        //Collection<String> keyCollection = keys;



    return keys;
    }
}
