package superProject.Model;

import java.util.ArrayList;

public class Material {

    private String name;
    private String specs;
    private int number;
    private String photoName;


    public Material(String name, String specs, int number, String photoName) {
        this.name = name;
        this.specs = specs;
        this.number = number;
        this.photoName = photoName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
}
