package sub_business_tier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import sub_business_tier.entities.TTitle_book;

public class TFacade {

    List<TTitle_book> mTitle_books;

    public TFacade() {
        mTitle_books = new ArrayList<>();
    }

    public List<TTitle_book> getmTitle_books() {
        return mTitle_books;
    }

    void setmTitle_books(List<TTitle_book> title_books) {
        mTitle_books = title_books;
    }

    public TTitle_book search_title_book(TTitle_book title_book) {
        int idx;
        if ((idx = mTitle_books.indexOf(title_book)) != -1) {
            title_book = mTitle_books.get(idx);
            return title_book;
        }
        return null;
    }

    public String add_title_book(String data[]) {
        TFactory factory = new TFactory();
        TTitle_book title_book = factory.create_title_book(data);
        if (search_title_book(title_book) == null) {
            mTitle_books.add(title_book);
            return title_book.toString();
        }
        return null;
    }

    public ArrayList<String> add_book(String data1[], String data2[]) {
        TTitle_book help1, title_exist;
        TFactory fabryka = new TFactory();
        help1 = fabryka.create_title_book(data1);
        if ((title_exist = search_title_book(help1)) != null) {
            return title_exist.add_book(data2);
        }
        return null;
    }

    public ArrayList<String> Search_title_book(String data[]) {
         return null;
    }
    
     public String Search_book(String data1[],String data2[]) {
        return null;
    }
    
//pomocnicza metoda 
   public Object[][] gettitle_books() {
        Object[][] title_books = new Object[mTitle_books.size()][];
        int i = 0;
        for (TTitle_book next : mTitle_books) {
            title_books[i++] = next.toString_();
        }
        return title_books;
    }

    public String Print_books() {
        String help = "";
        for (TTitle_book mTitle_book : mTitle_books) {
            ArrayList<String> help_list = mTitle_book.getbooks();
            for (String help_list1 : help_list) {
                help += help_list1;
            }
        }
        return help;
    }

    public String Print_title_books() {
        String help = "";
        Object[][] help_list = gettitle_books();
        for (Object[] next : help_list) {
            help += Arrays.toString(next) + "\n";
        }
        return help;
    }

    public static void main(String t[]) {
        
        //Należy rozszerzyć kod metody main w celu rozszerzenia przypadków testowania działania funkcji programu. 
        
        
        
        
            //jakie funkcje ma program ???
        
        
        
        //test1 - wyswietlanie tylko wybranej pozycji 
        
        
        
        //koniec rozszerzenia
        
        
        
        
        
        
        
        
        
        
        TFacade ap = new TFacade();
        String t1[] = {"1", "Author1", "Title1", "ISBN1", "Publisher1"};
        String t2[] = {"1", "Author2", "Title2", "ISBN2", "Publisher2"};
        String t3[] = {"1", "Author3", "Title3", "ISBN3", "Publisher3"};
        String t4[] = {"3", "Author1", "Title1", "ISBN1", "Publisher1", "Narrator1"};
        String t5[] = {"3", "Author2", "Title2", "ISBN2", "Publisher2", "Narrator2"};
        String t6[] = {"3", "Author4", "Title4", "ISBN4", "Publisher4", "Narrator4"};
        ap.add_title_book(t1);
        ap.add_title_book(t2);
        ap.add_title_book(t2);
        ap.add_title_book(t3);
        ap.add_title_book(t4);
        ap.add_title_book(t5);
        ap.add_title_book(t5);
        ap.add_title_book(t6);
        String lan = ap.getmTitle_books().toString();
        System.out.println(lan);
        String d1[] = {"0", "ISBN1"};
        String d2[] = {"0", "ISBN2"};
        String d3[] = {"0", "ISBN5"};
        String d4[] = {"2", "ISBN1", "Narrator1"};
        String d5[] = {"2", "ISBN4", "Narrator4"};
        String tr1[] = {"0", "1"};
        String tr2[] = {"0", "2"};
        ArrayList<String> pom = ap.add_book(d1, tr1);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d2, tr1);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d2, tr1);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d2, tr2);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d3, tr2);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d4, tr1);
        if (pom != null) {
            System.out.print(pom);
        }
        pom = ap.add_book(d5, tr2);
        if (pom != null) {
            System.out.print(pom);
        }

        System.out.println();
        System.out.println("\nTitles of book");
        System.out.print(ap.Print_title_books());

        System.out.print("\nBooks");
        System.out.println(ap.Print_books());

        System.out.println("\nSearching of a title with its books");
        ArrayList<String> searched_title_data=ap.Search_title_book(t6);
        if (searched_title_data!=null)
         System.out.print(searched_title_data + "\n");
        else
         System.out.print("No such title" + "\n");  
        
        System.out.print("\nSearching of a book of a title");
        String searched_book_data=ap.Search_book(d2, tr1);
        if (searched_book_data!=null)
         System.out.println(searched_book_data + "\n");
        else
         System.out.println("\n"+"No such book");  
           
    }
}
