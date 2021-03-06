
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        if (obj == this) {
            return true;
        }

        final LicensePlate compared = (LicensePlate) obj;

        return this.liNumber==compared.liNumber && 
                this.country==compared.country ; 
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.liNumber);
        hash = 89 * hash + Objects.hashCode(this.country);
        return hash;
    }
    
    
}
