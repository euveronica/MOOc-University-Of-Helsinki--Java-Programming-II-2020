
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        
        HashMap<String, String> list = new HashMap<>();
        list.put("Matthew", "Matt");
        list.put("Michael", "Mix");
        list.put("Arthur", "Artie");
        
        
        System.out.println(list.get("Matthew"));
    }

}
