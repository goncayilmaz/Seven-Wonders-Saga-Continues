package superProject.Model;


import java.util.ArrayList;

public class Age {

    private ArrayList<Card> cards;
    private int ageNumber;


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

    public boolean isCardListEmpty(){
        if (cards.isEmpty()){
            return true;
        }
        return false;
    }
}
