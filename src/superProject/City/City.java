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

    public String getBoardName()
    {
        return boardName;
    }

    public void setBoardName(String boardName)
    {
        this.boardName = boardName;
    }

    public ArrayList<Material> getCardSpecs()
    {
        return cardSpecs;
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

    public ArrayList<Material> getLevelItems(City city){
        if(city.getBoardLevel()==1){
            return city.getCardSpecsForLevel1();
        }
        if(city.getBoardLevel()==2){
            return city.getCardSpecsForLevel2();
        }
        if(city.getBoardLevel()==3){
            return city.getCardSpecsForLevel3();
        }
        else{
            return null;
        }
    }

    public boolean construct(City city, Player player)
    {
        boolean flag = false;
        int level = city.getBoardLevel();
        if(level < city.getMaxCityLevel())
        {
            ArrayList<Material> materialss= new ArrayList<>();
            materialss.add(city.getCardSpecs().get(0));
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

            for(int j=0;j<player.getCardsOnTable().size();j++)
            {
                if(player.getCardsOnTable().get(j).getEarnings().get(j).isWonderConstructorMaterial())
                {
                    materialss.add(player.getCardsOnTable().get(j).getEarnings().get(j));
                }
            }
            if(level == 0)
            {
                int counter = 0;
                ArrayList<Material> reqMaterial = city.getCardReqs1();
                for(int i = 0; i < reqMaterial.size(); i++)
                {
                    counter = 0;
                    for(int j = 0; j < materialss.size(); j++)
                    {
                        if(reqMaterial.get(i).getName() == materialss.get(j).getName())
                        {
                            counter = counter + materialss.get(j).getCount();
                            if(reqMaterial.get(i).getCount() == counter)
                            {
                                flag = true;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                return flag;
            }
            if(level == 1)
            {
                int counter = 0;
                ArrayList<Material> reqMaterial = city.getCardReqs2();
                for(int i = 0; i < reqMaterial.size(); i++)
                {
                    counter = 0;
                    for(int j = 0; j < materialss.size(); j++)
                    {
                        if(reqMaterial.get(i).getName() == materialss.get(j).getName())
                        {
                            counter = counter + materialss.get(j).getCount();
                            if(reqMaterial.get(i).getCount() == counter)
                            {
                                flag = true;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                return flag;
            }
            if(level == 2)
            {
                int counter = 0;
                ArrayList<Material> reqMaterial = city.getCardReqs3();
                for(int i = 0; i < reqMaterial.size(); i++)
                {
                    counter = 0;
                    for(int j = 0; j < materialss.size(); j++)
                    {
                        if(reqMaterial.get(i).getName() == materialss.get(j).getName())
                        {
                            counter = counter + materialss.get(j).getCount();
                            if(reqMaterial.get(i).getCount() == counter)
                            {
                                flag = true;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                return flag;
            }
            if(level == 3)
            {
                int counter = 0;
                ArrayList<Material> reqMaterial = city.getCardReqs4();
                for(int i = 0; i < reqMaterial.size(); i++)
                {
                    counter = 0;
                    for(int j = 0; j < materialss.size(); j++)
                    {
                        if(reqMaterial.get(i).getName() == materialss.get(j).getName())
                        {
                            counter = counter + materialss.get(j).getCount();
                            if(reqMaterial.get(i).getCount() == counter)
                            {
                                flag = true;
                            }
                            else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                return flag;
            }
        }
        return false;

    }
}
