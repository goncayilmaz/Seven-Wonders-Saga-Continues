package superProject.Model;

import java.util.ArrayList;

public class Card {

    private String name;
    private ArrayList<Material> requirements;
    private int specs;
    private ArrayList<Card> nextBuilds;
    private String type;
    private String photoName;
    private int ageNumber;


    public Card(String name, ArrayList<Material> requirements, int specs, ArrayList<Card> nextBuilds, String type, String photoName, int ageNumber) {
        this.name = name;
        this.requirements = requirements;
        this.specs = specs;
        this.nextBuilds = nextBuilds;
        this.type = type;
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

    public void setRequirements(ArrayList<Material> requirements) {
        this.requirements = requirements;
    }

    public int getSpecs() {
        return specs;
    }

    public void setSpecs(int specs) {
        this.specs = specs;
    }

    public ArrayList<Card> getNextBuilds() {
        return nextBuilds;
    }

    public void setNextBuilds(ArrayList<Card> nextBuilds) {
        this.nextBuilds = nextBuilds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
