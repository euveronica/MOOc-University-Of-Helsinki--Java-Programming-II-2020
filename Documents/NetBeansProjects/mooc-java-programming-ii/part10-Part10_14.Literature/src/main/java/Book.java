/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Veronica
 */
public class Book implements Comparable<Book>{
    private String name;
    private int ageRecommendation;

    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }

    public String getName() {
        return name;
    }

    public int getAgeRecommendation() {
        return ageRecommendation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgeRecommendation(int ageRecommendation) {
        this.ageRecommendation = ageRecommendation;
    }

    @Override
    public String toString() {
        return name + " (recommended for " + ageRecommendation + " year-olds or older)";
    }
    
    @Override
    public int compareTo(Book book) {
        if (this.ageRecommendation == book.getAgeRecommendation()) {
            return 0;
        } else if (this.ageRecommendation > book.getAgeRecommendation()) {
            return 1;
        } else {
            return -1;
        }
    }
    
    
}
