package superProject.Model;

import java.util.ArrayList;

public class City {

    private String boardName;// kart adı
    private ArrayList<Material> cardSpecs; // kartın her tur bize sağladığı item
    private int boardLevel; // kartın hangi level 1 - 2 - 3
    private ArrayList<Material> cardReqs1; // levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardReqs2;// levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardReqs3;// levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardSpecsForLevel1;
    private ArrayList<Material> cardSpecsForLevel2;
    private ArrayList<Material> cardSpecsForLevel3;
    private String photoName;
    private int boardNumber;

    public City(String boardName, ArrayList<Material> cardSpecs,
               int boardLevel, ArrayList<Material> cardReqs1, ArrayList<Material> cardReqs2,
               ArrayList<Material> cardReqs3, ArrayList<Material> cardSpecsForLevel1,
               ArrayList<Material> cardSpecsForLevel2, ArrayList<Material> cardSpecsForLevel3,
               String photoName, int boardNumber) {
        this.boardName = boardName;
        this.cardSpecs = cardSpecs;
        this.boardLevel = boardLevel;
        this.cardReqs1 = cardReqs1;
        this.cardReqs2 = cardReqs2;
        this.cardReqs3 = cardReqs3;
        this.cardSpecsForLevel1 = cardSpecsForLevel1;
        this.cardSpecsForLevel2 = cardSpecsForLevel2;
        this.cardSpecsForLevel3 = cardSpecsForLevel3;
        this.photoName = photoName;
        this.boardNumber = boardNumber;
    }

    public void increaseLevel(){
        boardLevel++;
    }


    public ArrayList<Material> getInitialItem(){
        if (boardLevel==0) {
            return cardSpecs;
        }
        if (boardLevel==1) {
            return cardSpecsForLevel1;
        }
        if (boardLevel==2) {
            return cardSpecsForLevel2;
        }
        if (boardLevel==3) {
            return cardSpecsForLevel3;
        }
        else{
            System.out.println("sorun var getInıtıalItem Metotu");
            return null;

        }

    }
}
