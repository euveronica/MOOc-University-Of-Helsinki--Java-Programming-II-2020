
import java.util.ArrayList;
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
public class VehicleRegistry {
    
   private  HashMap<LicensePlate, String> registry = new HashMap<>();
    
    public boolean add(LicensePlate licensePlate, String owner){
        
        if (registry.get(licensePlate) == null) {
            registry.put(licensePlate,owner);
            return true;
        }
        else return false;
        
    }
    
    public String get(LicensePlate licensePlate) {
        if (registry.containsKey(licensePlate)){
            return registry.get(licensePlate);
        } else return null;
    }
    
    public boolean remove(LicensePlate licensePlate) {
         if (registry.containsKey(licensePlate)){
            registry.remove(licensePlate);
            return true;
        } else return false;
    }
    
    public void printLicensePlates(){
            for (LicensePlate l : registry.keySet()){
                System.out.println(l);
            }
    }
    
    public void printOwners(){
        ArrayList<String> list = new ArrayList<>();
        for (String l : registry.values()){
            if (list.contains(l)){continue;}    
            else{
            list.add(l);
            }
        }
        
        for (String s:list){
            System.out.println(s);
        }
    }
}
