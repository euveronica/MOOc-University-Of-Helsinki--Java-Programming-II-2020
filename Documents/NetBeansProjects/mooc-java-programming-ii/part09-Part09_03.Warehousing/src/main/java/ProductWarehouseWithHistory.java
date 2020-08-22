
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
public class ProductWarehouseWithHistory extends ProductWarehouse{
    private ChangeHistory changeHistory = new ChangeHistory();
   // private double initialBalance;
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super (productName, capacity);
        //this.initialBalance = initialBalance;
        setBalance(initialBalance);
       // this.initialBalance = getBalance();
        changeHistory.add(initialBalance);
    }
    
    public void addToWarehouse(double amount){
     if (amount < 0) {
            return;
        }
       // if (amount <= (getCapacity()-initialBalance)) {
           // this.initialBalance = this.initialBalance + amount;
           // setBalance(initialBalance);
            if (amount <= (getCapacity()-getBalance())) {
            setBalance(getBalance()+amount);
        } else {
//            this.initialBalance = getCapacity();
//            setBalance(initialBalance);
               setBalance(getCapacity());
               
               
        }
       // changeHistory.add(initialBalance);
       changeHistory.add(getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        //if (amount > this.initialBalance) {
//            double allThatWeCan = this.initialBalance;
//            this.initialBalance = 0.0;
//            setBalance(initialBalance);
//            changeHistory.add(initialBalance);
//            return allThatWeCan;
        if (amount > getBalance()) {
            double allThatWeCan = getBalance();
            setBalance(0.0);
            changeHistory.add(getBalance());
            return allThatWeCan;
        }

//        this.initialBalance = this.initialBalance - amount;
//        setBalance(initialBalance);
//        changeHistory.add(initialBalance);
//        return amount;
//        
        
        setBalance(getBalance()-amount);
        changeHistory.add(getBalance());
        return amount;
    }
    
    public String history(){
        return changeHistory.toString();
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + getName());
        System.out.println("History: " + history());
        System.out.println("Largest amount of product: " + changeHistory.maxValue());
        System.out.println("Smallest amount of product: " + changeHistory.minValue());
        System.out.println("Average: "+ changeHistory.average());
    }
            
    @Override
    public String toString(){
     return super.toString();
    }
}
