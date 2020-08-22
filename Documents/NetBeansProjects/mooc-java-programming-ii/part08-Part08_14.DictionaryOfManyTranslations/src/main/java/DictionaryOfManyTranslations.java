
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
public class DictionaryOfManyTranslations {
     //private ArrayList<String> list = new ArrayList<>();
    //String[] s;
     private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
      
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        ArrayList<String> existing = this.dictionary.get(word);
        existing.add(translation);
        
    }
    
    public ArrayList<String> translate(String word){
        if (this.dictionary.get(word) != null){
        return this.dictionary.get(word);}
        else return new ArrayList<>();
        
    }
    public void remove(String word){
        dictionary.remove(word);
    }
}
