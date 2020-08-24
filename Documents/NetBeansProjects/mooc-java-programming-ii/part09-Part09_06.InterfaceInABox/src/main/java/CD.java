/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class CD implements Packable {
    
    private String artist;
    private String name;
    private int publYear;
    
    public CD (String artist, String name, int publYear){
        this.artist = artist;
        this.name = name;
        this.publYear = publYear;
    }
    
    
    @Override
    public double weight() {
        return 0.1;
    }
    
     @Override
    public String toString(){
        return this.artist + ": " + this.name + " (" + this.publYear + ")";
    }
}
