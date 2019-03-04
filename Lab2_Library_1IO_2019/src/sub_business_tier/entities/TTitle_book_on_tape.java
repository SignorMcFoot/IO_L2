package sub_business_tier.entities;

public class TTitle_book_on_tape extends TTitle_book {

    private String narrator;

   /**
     * @return the narrator
     */
    @Override
    public String getNarrator() {
        return narrator;
    }

    /**
     * @param narrator the narrator to set
     */
    @Override
    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    @Override
    public String toString() {
        String help = super.toString();
        help += " Narrator: " + getNarrator();
        return help;
    }

}
