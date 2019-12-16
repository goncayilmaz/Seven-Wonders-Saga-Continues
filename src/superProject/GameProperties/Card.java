package superProject.GameProperties;

import java.util.ArrayList;

public class Card {

    private String name; // name
    private ArrayList<Material> requirements; // materials for playing this card.
    private ArrayList<Material> earnings; // come from card materials
    private int Id; // special card id for implementing card chain
    private int nextCardId; // id of the free card from card chain.
    private String color; // card color
    private String photoName; // for photo directory
    private int ageNumber; // age number of card.


    public Card(String name, ArrayList<Material> requirements, ArrayList<Material> earnings, int Id, int nextCardId, String color, String photoName, int ageNumber) {
        this.name = name;
        this.requirements = requirements;
        this.earnings = earnings;
        this.Id = Id;
        this.nextCardId = nextCardId;
        this.color = color;
        this.photoName = photoName;
        this.ageNumber = ageNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Material> getRequirements() {
        return requirements;
    }
    public void setRequirements(ArrayList<Material> requirements){
        this.requirements = requirements;
    }

    public ArrayList<Material> getEarnings() {
        return earnings;
    }

    public void setEarnings(ArrayList<Material> earnings) {
        this.earnings = earnings;
    }

    public int getId(){
        return Id;
    }

    public void setId(int Id){
        this.Id = Id;
    }

    public int getNextCardId(){
        return nextCardId;
    }

    public void setNextCardId(int nextCardId){
        this.nextCardId = nextCardId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    public int getAgeNumber() {
        return ageNumber;
    }

    public void setAgeNumber(int ageNumber) {
        this.ageNumber = ageNumber;
    }
}
