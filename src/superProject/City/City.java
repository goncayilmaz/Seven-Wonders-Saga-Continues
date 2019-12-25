package superProject.City;

import superProject.GameProperties.Material;
import superProject.Player.Player;

import java.util.ArrayList;

public class City {

    private String boardName;// kart adı
    private ArrayList<Material> cardSpecs; // kartın her tur bize sağladığı item
    private int boardLevel; // kartın hangi level 1 - 2 - 3
    private ArrayList<Material> cardReqs1; // levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardReqs2;// levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardReqs3;// levele geçmek için verilmesi gerekenler
    private ArrayList<Material> cardReqs4;// B'deki Giza piramidi için
    private ArrayList<Material> cardSpecsForLevel1; // bu değişmiyor galiba tekrar bakayım
    private ArrayList<Material> cardSpecsForLevel2;
    private ArrayList<Material> cardSpecsForLevel3;
    private ArrayList<Material> cardSpecsForLevel4;
    private String photoName;
    private int boardNumber;
    private int maxCityLevel;
    private boolean orSituation;

    public City(String boardName, ArrayList<Material> cardSpecs,
                int boardLevel, ArrayList<Material> cardReqs1, ArrayList<Material> cardReqs2,
                ArrayList<Material> cardReqs3, ArrayList<Material> cardReqs4, ArrayList<Material> cardSpecsForLevel1,
                ArrayList<Material> cardSpecsForLevel2, ArrayList<Material> cardSpecsForLevel3,
                ArrayList<Material> cardSpecsForLevel4, String photoName, int boardNumber, int maxCityLevel)
    {
        this.boardName = boardName;
        this.cardSpecs = cardSpecs;
        this.boardLevel = boardLevel;
        this.cardReqs1 = cardReqs1;
        this.cardReqs2 = cardReqs2;
        this.cardReqs3 = cardReqs3;
        this.cardReqs4 = cardReqs4;
        this.cardSpecsForLevel1 = cardSpecsForLevel1;
        this.cardSpecsForLevel2 = cardSpecsForLevel2;
        this.cardSpecsForLevel3 = cardSpecsForLevel3;
        this.cardSpecsForLevel4 = cardSpecsForLevel4;
        this.photoName = photoName;
        this.boardNumber = boardNumber;
        orSituation = false;
        this.maxCityLevel = maxCityLevel;
    }

    public City(){
        boardName = "Ephesus The Efe King";
        cardSpecs = new ArrayList<Material>();
        cardReqs1 = new ArrayList<Material>();
        cardReqs2 = new ArrayList<Material>();
        cardReqs3 = new ArrayList<Material>();
        cardReqs4 = new ArrayList<Material>();
        cardSpecsForLevel1 = new ArrayList<Material>();
        cardSpecsForLevel2 = new ArrayList<Material>();
        cardSpecsForLevel3 = new ArrayList<Material>();
        cardSpecsForLevel4 = new ArrayList<Material>();
        photoName = "";
        orSituation = false;
    }
    public City(String boardName, ArrayList<Material> cardSpecs,
                int boardLevel, ArrayList<Material> cardReqs1, ArrayList<Material> cardReqs2,
                ArrayList<Material> cardReqs3, ArrayList<Material> cardSpecsForLevel1,
                ArrayList<Material> cardSpecsForLevel2, ArrayList<Material> cardSpecsForLevel3,
                String photoName, int boardNumber, boolean orSituation, int maxCityLevel)
    {
        this.boardName = boardName;
        this.cardSpecs = cardSpecs;
        this.boardLevel = boardLevel;
        this.cardReqs1 = cardReqs1;
        this.cardReqs2 = cardReqs2;
        this.cardReqs3 = cardReqs3;
        cardReqs4 = new ArrayList<Material>();
        cardReqs4.add(new Material("none",0));
        this.cardSpecsForLevel1 = cardSpecsForLevel1;
        this.cardSpecsForLevel2 = cardSpecsForLevel2;
        this.cardSpecsForLevel3 = cardSpecsForLevel3;
        cardSpecsForLevel4 = new ArrayList<Material>();
        cardSpecsForLevel4.add(new Material("none",0));
        this.photoName = photoName;
        this.boardNumber = boardNumber;
        this.orSituation = orSituation;
        this.maxCityLevel = maxCityLevel;
    }
    public void increaseLevel(Player player)
    {
        if(construct(this, player))
            boardLevel++;
    }
    public int getMaxCityLevel()
    {
        return maxCityLevel;
    }

    public ArrayList<Material> getInitialItem()
    {
        if (boardLevel == 0) {
            return cardSpecs;
        }
        else if (boardLevel == 1) {
            return cardSpecsForLevel1;
        }
        else if (boardLevel == 2) {
            return cardSpecsForLevel2;
        }
        else if (boardLevel == 3) {
            return cardSpecsForLevel3;
        }
        else if (boardLevel == 4){
            return cardSpecsForLevel4;
        }
        else{
            System.out.println("sorun var getInıtıalItem Metotu");
            return null;

        }
    }

    public String getBoardName()
    {
        return boardName;
    }

    public void setBoardName(String boardName)
    {
        this.boardName = boardName;
    }

    public Material getCardSpecs()
    {
        return cardSpecs.get(0);
    }

    public void setCardSpecs(ArrayList<Material> cardSpecs)
    {
        this.cardSpecs = cardSpecs;
    }

    public int getBoardLevel()
    {
        return boardLevel;
    }

    public void setBoardLevel(int boardLevel)
    {
        this.boardLevel = boardLevel;
    }

    public ArrayList<Material> getCardReqs1()
    {
        return cardReqs1;
    }

    public void setCardReqs1(ArrayList<Material> cardReqs1)
    {
        this.cardReqs1 = cardReqs1;
    }

    public ArrayList<Material> getCardReqs2()
    {
        return cardReqs2;
    }

    public void setCardReqs2(ArrayList<Material> cardReqs2)
    {
        this.cardReqs2 = cardReqs2;
    }

    public ArrayList<Material> getCardReqs3()
    {
        return cardReqs3;
    }

    public ArrayList<Material> getCardReqs4()
    {
        return cardReqs4;
    }

    public void setCardReqs3(ArrayList<Material> cardReqs3)
    {
        this.cardReqs3 = cardReqs3;
    }

    public ArrayList<Material> getCardSpecsForLevel1()
    {
        return cardSpecsForLevel1;
    }

    public void setCardSpecsForLevel1(ArrayList<Material> cardSpecsForLevel1)
    {
        this.cardSpecsForLevel1 = cardSpecsForLevel1;
    }

    public ArrayList<Material> getCardSpecsForLevel2()
    {
        return cardSpecsForLevel2;
    }

    public void setCardSpecsForLevel2(ArrayList<Material> cardSpecsForLevel2)
    {
        this.cardSpecsForLevel2 = cardSpecsForLevel2;
    }

    public ArrayList<Material> getCardSpecsForLevel3()
    {
        return cardSpecsForLevel3;
    }

    public void setCardSpecsForLevel3(ArrayList<Material> cardSpecsForLevel3)
    {
        this.cardSpecsForLevel3 = cardSpecsForLevel3;
    }

    public ArrayList<Material> getCardSpecsForLevel4()
    {
        return cardSpecsForLevel4;
    }

    public String getPhotoName()
    {
        return photoName;
    }

    public void setPhotoName(String photoName)
    {
        this.photoName = photoName;
    }

    public int getBoardNumber()
    {
        return boardNumber;
    }

    public void setBoardNumber(int boardNumber)
    {
        this.boardNumber = boardNumber;
    }
    public void print() {
        System.out.println("boardName: " + boardName  + " boardLevel: " + boardLevel);
        System.out.print("Requirements: ");
        for (int i = 0; i < cardSpecs.size(); i++) {
            cardSpecs.get(i).print();
        }
        for (int i = 0; i < cardReqs1.size(); i++) {
            cardReqs1.get(i).print();
        }
        for (int i = 0; i < cardReqs2.size(); i++) {
            cardReqs2.get(i).print();
        }
        for (int i = 0; i < cardReqs3.size(); i++) {
            cardReqs3.get(i).print();
        }
        for (int i = 0; i < cardReqs4.size(); i++) {
            cardReqs4.get(i).print();
        }
        System.out.println();
        System.out.print("Earnings: ");
        for (int i = 0; i < cardSpecsForLevel1.size(); i++) {
            cardSpecsForLevel1.get(i).print();
        }
        for (int i = 0; i < cardSpecsForLevel2.size(); i++) {
            cardSpecsForLevel2.get(i).print();
        }
        for (int i = 0; i < cardSpecsForLevel3.size(); i++) {
            cardSpecsForLevel3.get(i).print();
        }
        for (int i = 0; i < cardSpecsForLevel4.size(); i++) {
            cardSpecsForLevel4.get(i).print();
        }
        System.out.println();
    }

    public ArrayList<Material> getLevelItems(){
        if(boardLevel == 0){
            return cardSpecs;
        }
        else if(boardLevel == 1){
            return cardSpecsForLevel1;
        }
        else if(boardLevel == 2){
            return cardSpecsForLevel2;
        }
        else if(boardLevel == 3){
            return cardSpecsForLevel3;
        }else if(boardLevel == 4){
            return cardSpecsForLevel4;
        }
        else
            System.out.println("fuck" + boardLevel);
            return null;

    }

    public boolean construct(City city, Player player)
    {
        int numberOfClay = 0;
        int numberOfOre = 0;
        int numberOfStone = 0;
        int numberOfWood = 0;
        int numberOfLoom = 0;
        int numberOfGlass= 0;
        int numberOfPapyrus = 0;


        int level = city.getBoardLevel();
        if(level < city.getMaxCityLevel())
        {
            ArrayList<Material> materialss = new ArrayList<>();
            materialss.add(city.getCardSpecs());
            if(level > 0)
            {
                for(int i=0;i<city.getCardSpecsForLevel1().size();i++)
                {
                    if(city.getCardSpecsForLevel1().get(i).isWonderConstructorMaterial())
                    {
                        materialss.add(city.getCardSpecsForLevel1().get(i));
                    }

                }
            }
            if(level > 1)
            {
                for(int i = 0; i < city.getCardSpecsForLevel2().size(); i++)
                {
                    if(city.getCardSpecsForLevel2().get(i).isWonderConstructorMaterial())
                    {
                        materialss.add(city.getCardSpecsForLevel2().get(i));
                    }
                }
            }
            if(level > 2)
            {
                for(int i = 0; i < city.getCardSpecsForLevel3().size(); i++)
                {
                    if(city.getCardSpecsForLevel3().get(i).isWonderConstructorMaterial())
                    {
                        materialss.add(city.getCardSpecsForLevel3().get(i));
                    }
                }
            }
            if(level > 3)
            {
                for(int i = 0; i < city.getCardSpecsForLevel4().size(); i++)
                {
                    if(city.getCardSpecsForLevel4().get(i).isWonderConstructorMaterial())
                    {
                        materialss.add(city.getCardSpecsForLevel4().get(i));
                    }
                }
            }
            for(int i = 0; i < materialss.size(); i++)
            {
                materialss.get(i).print();
            }
            for(int i=0; i < player.getCardsOnTable().size(); i++)
            {
                for(int j = 0; j < player.getCardsOnTable().get(i).getEarnings().size(); j++)
                {
                    if(player.getCardsOnTable().get(i).getEarnings().get(j).isWonderConstructorMaterial())
                    {
                        materialss.add(player.getCardsOnTable().get(j).getEarnings().get(j));
                    }
                }
            }

            for(int i = 0; i < materialss.size(); i++) {
                if (materialss.get(i).getName() == "Clay") {
                    numberOfClay += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Ore") {
                    numberOfOre += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Stone") {
                    numberOfStone += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Wood") {
                    numberOfWood += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Loom") {
                    numberOfLoom += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Glass") {
                    numberOfGlass += materialss.get(i).getCount();
                } else if (materialss.get(i).getName() == "Papyrus") {
                    numberOfPapyrus += materialss.get(i).getCount();
                } else {
                    // do nothing.
                }
            }
            return isConstructable(level, numberOfClay, numberOfOre, numberOfStone, numberOfWood, numberOfLoom, numberOfGlass, numberOfPapyrus);
        }
        return false;

    }
    public boolean isConstructable(int level, int numberOfClay, int numberOfOre, int numberOfStone, int numberOfWood, int numberOfLoom,
                                   int numberOfGlass, int numberOfPapyrus)
    {
        int clayCounter    = numberOfClay;
        int oreCounter     = numberOfOre;
        int stoneCounter   = numberOfStone;
        int woodCounter    = numberOfWood;
        int loomCounter    = numberOfLoom;
        int glassCounter   = numberOfGlass;
        int papyrusCounter = numberOfPapyrus;
        ArrayList<Material> req;
        if(level == 0)
            req = getCardReqs1();
        else if(level == 1)
            req = getCardReqs2();
        else if(level == 2)
            req = getCardReqs3();
        else
            req = getCardReqs4();

        boolean flag = true;
        for(int i = 0; i < req.size(); i++) {
            if (req.get(i).getName().equals("Clay")) {
                if (clayCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Ore")) {
                if (oreCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Stone")) {
                if (stoneCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Wood")) {
                if (woodCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Loom")) {
                if (loomCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Glass")) {
                if (glassCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else if (req.get(i).getName().equals("Papyrus")) {
                if (papyrusCounter < req.get(i).getCount()) {
                    flag = false;
                }
            } else {

            }
        }
        return flag;
    }
    public static boolean contains(ArrayList<Material> arr, String matName)
    {
        for(int i = 0; i < arr.size(); i++)
        {
            if(matName.equals(arr.get(i).getName()))
            {
                return true;
            }
        }
        return false;
    }
    // this method returns the total victory points player get from building wonders
    public int getNumberWonderPoints(){
        int total = 0;
        if(boardLevel >= 1){
            for(int i = 0; i < cardSpecsForLevel1.size(); i++){
                if(cardSpecsForLevel1.get(i).getName().equals("Civilian"))
                    total += cardSpecsForLevel1.get(i).getCount();
            }
        }
        if(boardLevel >= 2){
            for(int i = 0; i < cardSpecsForLevel2.size(); i++){
                if(cardSpecsForLevel2.get(i).getName().equals("Civilian"))
                    total += cardSpecsForLevel2.get(i).getCount();
            }
        }
        if(boardLevel >= 3){
            for(int i = 0; i < cardSpecsForLevel3.size(); i++){
                if(cardSpecsForLevel3.get(i).getName().equals("Civilian"))
                    total += cardSpecsForLevel3.get(i).getCount();
            }
        }
        if(boardLevel >= 4){
            for(int i = 0; i < cardSpecsForLevel4.size(); i++){
                if(cardSpecsForLevel4.get(i).getName().equals("Civilian"))
                    total += cardSpecsForLevel4.get(i).getCount();
            }
        }
        return total;
    }


    public boolean isWonderConstructMaterial(Material material){
        if (boardLevel == 0) {
            for(int i = 0; i < cardSpecsForLevel1.size(); i++){
                if(cardSpecsForLevel1.get(i).getName().equals(material.getName()))
                    return true;
            }
        }
        else if(boardLevel == 1){
            for(int i = 0; i < cardSpecsForLevel2.size(); i++){
                if(cardSpecsForLevel2.get(i).getName().equals(material.getName()))
                    return true;
            }
        }
        else if(boardLevel == 2){
            for(int i = 0; i < cardSpecsForLevel3.size(); i++){
                if(cardSpecsForLevel3.get(i).getName().equals(material.getName()))
                    return true;
            }
        }
        else{ // 3 wonder build, gizah exception sonra
            return false;
        }
        return false;
    }

}
