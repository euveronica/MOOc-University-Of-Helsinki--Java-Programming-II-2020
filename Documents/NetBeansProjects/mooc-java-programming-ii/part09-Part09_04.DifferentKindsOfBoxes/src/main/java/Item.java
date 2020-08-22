
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int hashCode(){
     return name.hashCode();
    }
    
    public boolean equals(Item O){
        if (O == null) return false;
        return this.name == O.name;
    }
    
    
}
