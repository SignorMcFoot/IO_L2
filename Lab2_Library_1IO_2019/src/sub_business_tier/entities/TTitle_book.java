package sub_business_tier.entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import sub_business_tier.TFactory;


public class TTitle_book {

    private String publisher;

    private String ISBN;

    private String title;

    private String author;

    // List<TBook> mBooks;
    List<TBook> mBooks;

    public TTitle_book() {
        mBooks = new ArrayList();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String narrator) {
        this.author = narrator;
    }

    public List<TBook> getmBooks() {
        return mBooks;
    }

    public void setmBooks(List<TBook> mBooks) {
        this.mBooks = mBooks;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.ISBN);
        return hash;
    }

   public String getNarrator() {
        return "";
    }

    public void setNarrator(String val) {
    }

    public ArrayList<String> getbooks() {
        ArrayList<String> title_books = new ArrayList<>();
        Iterator<TBook> help = mBooks.iterator();
        while (help.hasNext()) {
            TBook next = help.next();
            title_books.add(next.toString());
        }
        return title_books;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (getISBN().equals(((TTitle_book) obj).getISBN())) {
            if (getNarrator().equals(((TTitle_book) obj).getNarrator())) {
                result = true;
            }
        }
        return result;
    }

    public ArrayList<String> add_book(String data[]) {
        TFactory factory = new TFactory();
        TBook newbook;
        newbook = factory.create_book(data);
        if (search_book(newbook) == null) {
            mBooks.add(newbook);
            newbook.setmTitle_book(this);
            return getbooks();
        }
        return null;
    }

    public TBook search_book(TBook book) {
        int idx;
        if ((idx = mBooks.indexOf(book)) != -1) {
            book = (TBook) mBooks.get(idx);
            return book;
        }
        return null;
    }

    public String Search_book(String []data) {
        return null;
    }
    
   @Override
    public String toString() {
        String help = "\nTitle: " + getTitle();
        help += " Author: " + getAuthor();
        help += " ISBN: " + getISBN();
        help += " Publisher: " + getPublisher();
        return help;
    }

    public String[] toString_() {
        String[] titledata = new String[5];
        titledata[0] = getPublisher();
        titledata[1] = getISBN();
        titledata[2] = getTitle();
        titledata[3] = getAuthor();
        titledata[4] = getNarrator();
        return titledata;
    }
}
