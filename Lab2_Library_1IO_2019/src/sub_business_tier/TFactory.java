package sub_business_tier;

import sub_business_tier.entities.TBook;
import sub_business_tier.entities.TTitle_book;
import sub_business_tier.entities.TTitle_book_on_tape;

public class TFactory {

     public TTitle_book create_title_book(String data[]) {
        TTitle_book title_book = null;
        switch (Integer.parseInt(data[0])) //what_title_book_type
        {
            case 0:
                title_book = new TTitle_book(); //TTitle_book object for searching
                title_book.setISBN(data[1]);
                break;
            case 1:
                title_book = new TTitle_book(); //TTitle_book object for persisting
                title_book.setAuthor(data[1]);
                title_book.setTitle(data[2]);
                title_book.setISBN(data[3]);
                title_book.setPublisher(data[4]);
                break;
            case 2:
                TTitle_book_on_tape title_book1 = new TTitle_book_on_tape();//TTitle_book_on_tape object for searching
                title_book1.setISBN(data[1]);
                title_book1.setNarrator(data[2]);
                title_book = title_book1;
                break;
            case 3:
                TTitle_book_on_tape title_book2 = new TTitle_book_on_tape();//TTitle_book_on_tape object for persisting
                title_book2.setAuthor(data[1]);
                title_book2.setTitle(data[2]);
                title_book2.setISBN(data[3]);
                title_book2.setPublisher(data[4]);
                title_book2.setNarrator(data[5]);
                title_book = title_book2;
                break;
        }
        return title_book;
    }

    public TBook create_book(String data[]) {
        TBook book = null;
        switch (Integer.parseInt(data[0])) //what_book_type
        {
            case 0:
                book = new TBook();//TBook object for persisting
                book.setNumber(Integer.parseInt(data[1]));
                break;
        }
        return book;
    }
}
