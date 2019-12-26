package superProject.GameProperties;

import java.util.ArrayList;

public class Material {

    private String name; // name of it
    private int count; // how much brings

    public Material(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public boolean isWonderConstructorMaterial()
    {
        if(name.equals("Civilian") || name.equals("Coin") || name.equals("ScienceWheel") || name.equals("ScienceRuler") || name.equals("ScienceStone"))
            return false;
        return true;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void print(){
        System.out.print(name + " " + count + " ");
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
