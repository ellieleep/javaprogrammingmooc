import java.util.ArrayList;
import java.util.Scanner;

public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String bookTitle, int bookPages, int pubYear){
        this.title = bookTitle;
        this.pages = bookPages;
        this.publicationYear = pubYear;
    }

    public String getTitle(){
        return this.title;
    }

    public String getEverything(){
        return this.title+", "+this.pages+" pages, "+this.publicationYear;
    }

    public static void main(String[] args){
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.equals("")){
                break;
            }
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication Year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            books.add(new Book(title,pages,publicationYear));
        }
        System.out.println("What information will be printed?");
        String choice = scanner.nextLine();
        if(choice.equals("everything")){
            for(Book book: books){
                System.out.println(book.getEverything());
            }
        }
        else if(choice.equals("name")){
            for(Book book: books){
                System.out.println(book.getTitle());
            }
        }
    }
}
