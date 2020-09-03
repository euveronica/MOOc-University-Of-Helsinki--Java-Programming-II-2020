
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Book> books = new ArrayList<>();
        int count =0;
        
        while (true){
                    System.out.print("Input the name of the book, empty stops: ");
                    String name = "";
                    if(scanner.hasNextLine()){name = scanner.nextLine();}
                    if (name.equals("")) {
                        break;
                      }
                    
                        System.out.print("Input the age recommendation: ");
                        int age = 0;
                        if (scanner.hasNextLine()) {age = Integer.valueOf(scanner.nextLine());}
                        books.add(new Book(name,age));
                        count++;

                 System.out.println("");
        }
        
        
        
       
        
        System.out.println(count + " books in total.");
        System.out.println("Books: ");
//        Collections.sort(books);
//        books.stream().forEach(b -> System.out.println(b));



Comparator<Book> comparator = Comparator
              .comparing(Book::getAgeRecommendation)
              .thenComparing(Book::getName);

Collections.sort(books, comparator);

for (Book b: books) {
    System.out.println(b);
}
}
    
} 

