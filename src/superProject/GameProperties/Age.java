package superProject.GameProperties;


import java.util.ArrayList;

public class Age {

    private ArrayList<Card> cards; // age cards
    private int ageNumber; // there are 3 ages on game


    public Age(ArrayList<Card> cards, int ageNumber) {
        this.cards = cards;
        this.ageNumber = ageNumber;
    }

    public ArrayList<Card> getCard() {
        return cards;
    }

    public void setCard(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int getAgeNumber() {
        return ageNumber;
    }

    public void setAgeNumber(int ageNumber) {
        this.ageNumber = ageNumber;
    }

    public boolean isCardListEmpty(){ // to check age is finish or not
        if (cards.isEmpty()){
            return true;
        }
        return false;
    }
}
