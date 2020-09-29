
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
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
public class Hand implements Comparable<Hand> {
    
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
        
    }
    
     
    public void add(Card card) {
        cards.add(card);
    }
    
    public List<Card> getCards() {
        return cards;
    }

       
    public void print() {
    
        Iterator<Card> iterator = cards.iterator();
        
        while (iterator.hasNext()) {
        Card nextInLine = iterator.next();
        
            System.out.println(nextInLine);
        }
        
    }
    
    public int sum(){
        int sum = 0;
        for (Card c : cards) {
            sum += c.getValue();
        }
        
        return sum;
        
    }
    
    public void sort(){
       Collections.sort(cards);
                
    }
    public void sortBySuit(){
        Collections.sort(cards, new BySuitInValueOrder());
      

        
    }

    @Override
    public int compareTo(Hand o) {
        if (this.sum() == o.sum()) {
        return 0;
            
        } else if (this.sum() > o.sum()) {
            return 1;
        } else {
            return -1;
        } //To change body of generated methods, choose Tools | Templates.
    }
}
