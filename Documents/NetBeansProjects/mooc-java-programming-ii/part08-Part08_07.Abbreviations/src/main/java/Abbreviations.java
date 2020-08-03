
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
public class Abbreviations {
    private HashMap<String,String> abbr = new HashMap<>();
    
    public void addAbbreviation(String abbreviation, String explanation){
        abbr.put(abbreviation, explanation);
    }
    public boolean hasAbbreviation(String abbreviation){
        if (abbr.containsKey(abbreviation)){
        return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (hasAbbreviation(abbreviation) == false){
            return null;
        }
        else{
            return abbr.get(abbreviation);
        }
    }
}
