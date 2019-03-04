package sub_business_tier.entities;

public class TBook {

    private int number;

    private TTitle_book mTitle_book;

    public TBook() {
    }

    public int getNumber() {
        return number;
    }
     
    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the mTitle_book
     */
    public TTitle_book getmTitle_book() {
        return mTitle_book;
    }

    /**
     * @param mTitle_book the mTitle_book to set
     */
    public void setmTitle_book(TTitle_book mTitle_book) {
        this.mTitle_book = mTitle_book;
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != 0 ? number : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        return number == ((TBook) obj).getNumber();
    }

    @Override
    public String toString() // your code here
    {
        String help = mTitle_book.toString();
        help += " Number: " + getNumber();
        return help;
    }
}
