
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private Double literacyPercent;
       
    public static void main(String[] args) {

      List<LiteracyComparison> literacy = new ArrayList<>();
try {
    Files.lines(Paths.get("literacy.csv"))
        .map(row -> row.split(","))
        .filter(parts -> parts.length >= 4)
        .map(parts -> new LiteracyComparison(parts[0].trim(),parts[1].trim(), parts[2].trim(), parts[3].trim(), Integer.parseInt(parts[4].trim()), Double.parseDouble(parts[5].trim())))
        .forEach(lit -> {
            String[] l = new String[2];
           l = lit.getGender().split(" ");
           lit.setGender(l[0]);
           literacy.add(lit);
        });
} catch (Exception e) {
    System.out.println("Error: " + e.getMessage());
}



      
literacy.stream().sorted((p1, p2) -> {
    return p1.getLiteracyPercent().compareTo(p2.getLiteracyPercent());
}).forEach(p -> System.out.println(p));
        
    }

    public LiteracyComparison(String theme, String ageGroup, String gender, String country, int year, Double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }

    

    public String getTheme() {
        return theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public Double getLiteracyPercent() {
        return literacyPercent;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    @Override
    public String toString(){
    
        
        return this.country + " (" + this.year+ "), "+ this.gender + ", " + this.literacyPercent;
        
    }
    
    
    
    
    
    
    
    
}
