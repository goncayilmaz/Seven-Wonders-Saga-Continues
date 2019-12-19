package superProject.City;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import superProject.GameProperties.Material;

import java.util.ArrayList;
import java.util.Collections;

public class CityManager extends Application {

    private ArrayList<City> citiesA;
    private ArrayList<City> citiesB;

    private int numberOfCities;



    @Override
    public void start(Stage primaryStage) throws Exception
    {


        try
        {

            Parent root = FXMLLoader.load(getClass().getResource("../Menu/CitySelectionViewFX.fxml"));
            primaryStage.setTitle("City Selection");

            primaryStage.setScene(new Scene(root, 500, 350));
            primaryStage.setResizable(false);
            primaryStage.show();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        createCity(false);
        arrangeCities(2, "The Hanging Gardens of Babylon", false);
        printCities(citiesB);

    }
    public void createCity(boolean boardType)
    {
        if(boardType == true)
            createACities();
        else
            createBCities();
    }

    /**
     * This method creates wonders with respect to A side
     */
    public void createACities()
    {

        citiesA = new ArrayList<City>();

        ArrayList<Material> earningsOfAlexandria  = new ArrayList<Material>();
        earningsOfAlexandria.add(new Material("Glass",1));

        ArrayList<Material> firstLevelReq = new ArrayList<Material>();
        firstLevelReq.add(new Material("Stone", 2));
        ArrayList<Material> secondLevelReq = new ArrayList<Material>();
        secondLevelReq.add(new Material("Ore", 2));
        ArrayList<Material> thirdLevelReq = new ArrayList<Material>();
        thirdLevelReq.add(new Material("Glass", 2));

        ArrayList<Material> earningOfAlexandriaLev1 = new ArrayList<Material>();
        earningOfAlexandriaLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfAlexandriaLev2 = new ArrayList<Material>();
        earningOfAlexandriaLev2.add(new Material("Clay", 1));
        earningOfAlexandriaLev2.add(new Material("Ore", 1));
        earningOfAlexandriaLev2.add(new Material("Wood", 1));
        earningOfAlexandriaLev2.add(new Material("Stone", 1));
        ArrayList<Material> earningOfAlexandriaLev3 = new ArrayList<Material>();
        earningOfAlexandriaLev3.add(new Material("Civilian", 7));

        City alexandria = new City("The Lighthouse of Alexandria", earningsOfAlexandria, 0, firstLevelReq, secondLevelReq,
                thirdLevelReq, earningOfAlexandriaLev1, earningOfAlexandriaLev2, earningOfAlexandriaLev3, "alexandriaA.png", 0, true);

        citiesA.add(alexandria);



        ArrayList<Material> earningsOfRhodes  = new ArrayList<Material>();
        earningsOfRhodes.add(new Material("Ore",1));

        ArrayList<Material> firstLevelReqRhodes = new ArrayList<Material>();
        firstLevelReqRhodes.add(new Material("Wood", 2));
        ArrayList<Material> secondLevelReqRhodes = new ArrayList<Material>();
        secondLevelReqRhodes.add(new Material("Clay", 3));
        ArrayList<Material> thirdLevelReqRhodes = new ArrayList<Material>();
        thirdLevelReqRhodes.add(new Material("Ore", 4));

        ArrayList<Material> earningOfRhodesLev1 = new ArrayList<Material>();
        earningOfRhodesLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfRhodesLev2 = new ArrayList<Material>();
        earningOfRhodesLev2.add(new Material("Military", 2));
        ArrayList<Material> earningOfRhodesLev3 = new ArrayList<Material>();
        earningOfRhodesLev3.add(new Material("Civilian", 7));

        City rhodes = new City("The Colossus of Rhodes", earningsOfRhodes, 0, firstLevelReqRhodes, secondLevelReqRhodes,
                thirdLevelReqRhodes, new ArrayList<Material>(), earningOfRhodesLev1, earningOfRhodesLev2, earningOfRhodesLev3,
                new ArrayList<Material>(),"rhodosA.png", 0);
        citiesA.add(rhodes);



        ArrayList<Material> earningsOfEphesus  = new ArrayList<Material>();
        earningsOfEphesus.add(new Material("Papyrus",1));

        ArrayList<Material> firstLevelReqEphesus = new ArrayList<Material>();
        firstLevelReqEphesus.add(new Material("Stone", 2));
        ArrayList<Material> secondLevelReqEphesus = new ArrayList<Material>();
        secondLevelReqEphesus.add(new Material("Ore", 2));
        ArrayList<Material> thirdLevelReqEphesus = new ArrayList<Material>();
        thirdLevelReqEphesus.add(new Material("Papyrus", 2));

        ArrayList<Material> earningOfEphesusLev1 = new ArrayList<Material>();
        earningOfEphesusLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfEphesusLev2 = new ArrayList<Material>();
        earningOfEphesusLev2.add(new Material("Coin", 9));
        ArrayList<Material> earningOfEphesusLev3 = new ArrayList<Material>();
        earningOfEphesusLev3.add(new Material("Civilian", 7));

        City ephesus = new City("The Temple of Artemis in Ephesus", earningsOfEphesus, 0, firstLevelReqEphesus, secondLevelReqEphesus,
                thirdLevelReqEphesus, new ArrayList<Material>(), earningOfEphesusLev1, earningOfEphesusLev2, earningOfEphesusLev3,
                new ArrayList<Material>(),"ephesosA.png", 0);
        citiesA.add(ephesus);




        ArrayList<Material> earningsOfBabylon  = new ArrayList<Material>();
        earningsOfBabylon.add(new Material("Clay",1));

        ArrayList<Material> firstLevelBabylonReq = new ArrayList<Material>();
        firstLevelBabylonReq.add(new Material("Clay", 2));
        ArrayList<Material> secondLevelBabylonReq = new ArrayList<Material>();
        secondLevelBabylonReq.add(new Material("Wood", 3));
        ArrayList<Material> thirdLevelBabylonReq = new ArrayList<Material>();
        thirdLevelBabylonReq.add(new Material("Clay", 4));

        ArrayList<Material> earningOfBabylonLev1 = new ArrayList<Material>();
        earningOfBabylonLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfBabylonLev2 = new ArrayList<Material>();
        earningOfBabylonLev2.add(new Material("ScienceStone", 1));
        earningOfBabylonLev2.add(new Material("ScienceRuler", 1));
        earningOfBabylonLev2.add(new Material("ScienceWheel", 1));
        ArrayList<Material> earningOfBabylonLev3 = new ArrayList<Material>();
        earningOfBabylonLev3.add(new Material("Civilian", 7));

        City babylon = new City("The Hanging Gardens of Babylon", earningsOfBabylon, 0, firstLevelBabylonReq, secondLevelBabylonReq,
                thirdLevelBabylonReq, earningOfBabylonLev1, earningOfBabylonLev2, earningOfBabylonLev3, "babylonA.png", 0, true);

        citiesA.add(babylon);




        ArrayList<Material> earningsOfOlympia  = new ArrayList<Material>();
        earningsOfOlympia.add(new Material("Wood",1));

        ArrayList<Material> firstLevelOlympiaReq = new ArrayList<Material>();
        firstLevelOlympiaReq.add(new Material("Wood", 2));
        ArrayList<Material> secondLevelOlympiaReq = new ArrayList<Material>();
        secondLevelOlympiaReq.add(new Material("Stone", 2));
        ArrayList<Material> thirdLevelOlympiaReq = new ArrayList<Material>();
        thirdLevelOlympiaReq.add(new Material("Ore", 2));

        ArrayList<Material> earningOfOlympiaLev1 = new ArrayList<Material>();
        earningOfOlympiaLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfOlympiaLev2 = new ArrayList<Material>();//buraya özel fonksiyon gerekecek özel durum var
        ArrayList<Material> earningOfOlympiaLev3 = new ArrayList<Material>();
        earningOfOlympiaLev3.add(new Material("Civilian", 7));

        City olympia = new City("The Statue of Zeus in Olympia", earningsOfOlympia, 0, firstLevelOlympiaReq, secondLevelOlympiaReq,
                thirdLevelOlympiaReq, new ArrayList<Material>(), earningOfOlympiaLev1, earningOfOlympiaLev2, earningOfOlympiaLev3,
                new ArrayList<Material>(),"olympiaA.png", 0);

        citiesA.add(olympia);


        ArrayList<Material> earningsOfHalicarnassus  = new ArrayList<Material>();
        earningsOfHalicarnassus.add(new Material("Loom",1));

        ArrayList<Material> firstLevelHalicarnassusReq = new ArrayList<Material>();
        firstLevelHalicarnassusReq.add(new Material("Clay", 2));
        ArrayList<Material> secondLevelHalicarnassusReq = new ArrayList<Material>();
        secondLevelHalicarnassusReq.add(new Material("Ore", 3));
        ArrayList<Material> thirdLevelHalicarnassusReq = new ArrayList<Material>();
        thirdLevelHalicarnassusReq.add(new Material("Loom", 2));

        ArrayList<Material> earningOfHalicarnassusLev1 = new ArrayList<Material>();
        earningOfHalicarnassusLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfHalicarnassusLev2 = new ArrayList<Material>();//buraya özel fonksiyon gerekecek özel durum var
        ArrayList<Material> earningOfHalicarnassusLev3 = new ArrayList<Material>();
        earningOfHalicarnassusLev3.add(new Material("Civilian", 7));

        City halicarnassus = new City("The Mausoleum of Halicarnassus", earningsOfHalicarnassus, 0, firstLevelHalicarnassusReq, secondLevelHalicarnassusReq,
                thirdLevelHalicarnassusReq, new ArrayList<Material>(), earningOfHalicarnassusLev1, earningOfHalicarnassusLev2, earningOfHalicarnassusLev3,
                new ArrayList<Material>(),"halikarnassusA.png", 0);

        citiesA.add(halicarnassus);




        ArrayList<Material> earningsOfGiza  = new ArrayList<Material>();
        earningsOfGiza.add(new Material("Stone",1));

        ArrayList<Material> firstLevelGizaReq = new ArrayList<Material>();
        firstLevelGizaReq.add(new Material("Stone", 2));
        ArrayList<Material> secondLevelGizaReq = new ArrayList<Material>();
        secondLevelGizaReq.add(new Material("Wood", 3));
        ArrayList<Material> thirdLevelGizaReq = new ArrayList<Material>();
        thirdLevelGizaReq.add(new Material("Stone", 4));
        ArrayList<Material> earningOfGizaLev1 = new ArrayList<Material>();

        earningOfGizaLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfGizaLev2 = new ArrayList<Material>();
        earningOfGizaLev2.add(new Material("Civilian", 5));
        ArrayList<Material> earningOfGizaLev3 = new ArrayList<Material>();
        earningOfGizaLev3.add(new Material("Civilian", 7));

        City giza = new City("The Pyramids of Giza", earningsOfGiza, 0, firstLevelGizaReq, secondLevelGizaReq,
                thirdLevelGizaReq, new ArrayList<Material>(), earningOfGizaLev1, earningOfGizaLev2, earningOfGizaLev3,
                new ArrayList<Material>(),"gizahA.png", 0);

        citiesA.add(giza);


        Collections.shuffle(citiesA);
    }

    /**
     * This method creates wonders with respect to B side
     */
    public void createBCities()
    {
        citiesB = new ArrayList<City>();

        ArrayList<Material> earningsOfAlexandria  = new ArrayList<Material>();
        earningsOfAlexandria.add(new Material("Glass",1));

        ArrayList<Material> firstLevelReq = new ArrayList<Material>();
        firstLevelReq.add(new Material("Clay", 2));
        ArrayList<Material> secondLevelReq = new ArrayList<Material>();
        secondLevelReq.add(new Material("Wood", 2));
        ArrayList<Material> thirdLevelReq = new ArrayList<Material>();
        thirdLevelReq.add(new Material("Stone", 3));

        ArrayList<Material> earningOfAlexandriaLev1 = new ArrayList<Material>();
        earningOfAlexandriaLev1.add(new Material("Stone", 1));
        earningOfAlexandriaLev1.add(new Material("Clay", 1));
        earningOfAlexandriaLev1.add(new Material("Wood", 1));
        earningOfAlexandriaLev1.add(new Material("Ore", 1));

        ArrayList<Material> earningOfAlexandriaLev2 = new ArrayList<Material>();
        earningOfAlexandriaLev2.add(new Material("Glass", 1));
        earningOfAlexandriaLev2.add(new Material("Loom", 1));
        earningOfAlexandriaLev2.add(new Material("Papyrus", 1));

        ArrayList<Material> earningOfAlexandriaLev3 = new ArrayList<Material>();
        earningOfAlexandriaLev3.add(new Material("Civilian", 7));

        City alexandria = new City("The Lighthouse of Alexandria", earningsOfAlexandria, 0, firstLevelReq, secondLevelReq,
                thirdLevelReq, earningOfAlexandriaLev1, earningOfAlexandriaLev2, earningOfAlexandriaLev3, "alexandriaB.png", 1, true);

        citiesB.add(alexandria);



        ArrayList<Material> earningsOfRhodes  = new ArrayList<Material>();
        earningsOfRhodes.add(new Material("Ore",1));

        ArrayList<Material> firstLevelReqRhodes = new ArrayList<Material>();
        firstLevelReqRhodes.add(new Material("Stone", 3));
        ArrayList<Material> secondLevelReqRhodes = new ArrayList<Material>();
        secondLevelReqRhodes.add(new Material("Ore", 4));
        ArrayList<Material> thirdLevelReqRhodes = new ArrayList<Material>();


        ArrayList<Material> earningOfRhodesLev1 = new ArrayList<Material>();
        earningOfRhodesLev1.add(new Material("Civilian", 3));
        earningOfRhodesLev1.add(new Material("Military", 1));
        earningOfRhodesLev1.add(new Material("Coin", 3));

        ArrayList<Material> earningOfRhodesLev2 = new ArrayList<Material>();
        earningOfRhodesLev2.add(new Material("Military", 1));
        earningOfRhodesLev2.add(new Material("Coin", 4));
        earningOfRhodesLev2.add(new Material("Civilian", 4));

        ArrayList<Material> earningOfRhodesLev3 = new ArrayList<Material>();

        City rhodes = new City("The Colossus of Rhodes", earningsOfRhodes, 0, firstLevelReqRhodes, secondLevelReqRhodes,
                thirdLevelReqRhodes, new ArrayList<Material>(), earningOfRhodesLev1, earningOfRhodesLev2, earningOfRhodesLev3,
                new ArrayList<Material>(),"rhodosB.png", 1);
        citiesB.add(rhodes);





        ArrayList<Material> earningsOfEphesus  = new ArrayList<Material>();
        earningsOfEphesus.add(new Material("Papyrus",1));

        ArrayList<Material> firstLevelReqEphesus = new ArrayList<Material>();
        firstLevelReqEphesus.add(new Material("Stone", 2));
        ArrayList<Material> secondLevelReqEphesus = new ArrayList<Material>();
        secondLevelReqEphesus.add(new Material("Wood", 2));
        ArrayList<Material> thirdLevelReqEphesus = new ArrayList<Material>();
        thirdLevelReqEphesus.add(new Material("Papyrus", 1));
        thirdLevelReqEphesus.add(new Material("Loom", 1));
        thirdLevelReqEphesus.add(new Material("Glass", 1));


        ArrayList<Material> earningOfEphesusLev1 = new ArrayList<Material>();
        earningOfEphesusLev1.add(new Material("Civilian", 2));
        earningOfEphesusLev1.add(new Material("Coin", 4));


        ArrayList<Material> earningOfEphesusLev2 = new ArrayList<Material>();
        earningOfEphesusLev2.add(new Material("Coin", 4));
        earningOfEphesusLev2.add(new Material("Civilian", 3));


        ArrayList<Material> earningOfEphesusLev3 = new ArrayList<Material>();
        earningOfEphesusLev3.add(new Material("Civilian", 5));
        earningOfEphesusLev3.add(new Material("Coin", 4));


        City ephesus = new City("The Temple of Artemis in Ephesus", earningsOfEphesus, 0, firstLevelReqEphesus, secondLevelReqEphesus,
                thirdLevelReqEphesus, new ArrayList<Material>(), earningOfEphesusLev1, earningOfEphesusLev2, earningOfEphesusLev3,
                new ArrayList<Material>(),"ephesosB.png", 1);
        citiesB.add(ephesus);




        ArrayList<Material> earningsOfBabylon  = new ArrayList<Material>();
        earningsOfBabylon.add(new Material("Clay",1));

        ArrayList<Material> firstLevelBabylonReq = new ArrayList<Material>();
        firstLevelBabylonReq.add(new Material("Clay", 1));
        firstLevelBabylonReq.add(new Material("Loom", 1));

        ArrayList<Material> secondLevelBabylonReq = new ArrayList<Material>();
        secondLevelBabylonReq.add(new Material("Wood", 2));
        secondLevelBabylonReq.add(new Material("Glass", 1));

        ArrayList<Material> thirdLevelBabylonReq = new ArrayList<Material>();
        thirdLevelBabylonReq.add(new Material("Clay", 3));
        thirdLevelBabylonReq.add(new Material("Papyrus", 1));


        ArrayList<Material> earningOfBabylonLev1 = new ArrayList<Material>();
        earningOfBabylonLev1.add(new Material("Civilian", 3));

        ArrayList<Material> earningOfBabylonLev2 = new ArrayList<Material>();//özel durum


        ArrayList<Material> earningOfBabylonLev3 = new ArrayList<Material>();
        earningOfBabylonLev3.add(new Material("ScienceStone", 1));
        earningOfBabylonLev3.add(new Material("ScienceRuler", 1));
        earningOfBabylonLev3.add(new Material("ScienceWheel", 1));

        City babylon = new City("The Hanging Gardens of Babylon", earningsOfBabylon, 0, firstLevelBabylonReq, secondLevelBabylonReq,
                thirdLevelBabylonReq, earningOfBabylonLev1, earningOfBabylonLev2, earningOfBabylonLev3, "babylonB.png", 1, true);

        citiesB.add(babylon);






        ArrayList<Material> earningsOfOlympia  = new ArrayList<Material>();
        earningsOfOlympia.add(new Material("Wood",1));

        ArrayList<Material> firstLevelOlympiaReq = new ArrayList<Material>();
        firstLevelOlympiaReq.add(new Material("Wood", 2));
        ArrayList<Material> secondLevelOlympiaReq = new ArrayList<Material>();
        secondLevelOlympiaReq.add(new Material("Stone", 2));
        ArrayList<Material> thirdLevelOlympiaReq = new ArrayList<Material>();
        thirdLevelOlympiaReq.add(new Material("Ore", 2));
        thirdLevelOlympiaReq.add(new Material("Loom", 1));

        ArrayList<Material> earningOfOlympiaLev1 = new ArrayList<Material>();//özel durum

        ArrayList<Material> earningOfOlympiaLev2 = new ArrayList<Material>();//buraya özel fonksiyon gerekecek özel durum var
        earningOfOlympiaLev2.add(new Material("Civilian", 5));

        ArrayList<Material> earningOfOlympiaLev3 = new ArrayList<Material>();//özel durum


        City olympia = new City("The Statue of Zeus in Olympia", earningsOfOlympia, 0, firstLevelOlympiaReq, secondLevelOlympiaReq,
                thirdLevelOlympiaReq, new ArrayList<Material>(), earningOfOlympiaLev1, earningOfOlympiaLev2, earningOfOlympiaLev3,
                new ArrayList<Material>(),"olympiaB.png", 1);

        citiesB.add(olympia);





        ArrayList<Material> earningsOfHalicarnassus  = new ArrayList<Material>();
        earningsOfHalicarnassus.add(new Material("Loom",1));

        ArrayList<Material> firstLevelHalicarnassusReq = new ArrayList<Material>();
        firstLevelHalicarnassusReq.add(new Material("Ore", 2));
        ArrayList<Material> secondLevelHalicarnassusReq = new ArrayList<Material>();
        secondLevelHalicarnassusReq.add(new Material("Clay", 3));
        ArrayList<Material> thirdLevelHalicarnassusReq = new ArrayList<Material>();
        thirdLevelHalicarnassusReq.add(new Material("Loom", 1));
        thirdLevelHalicarnassusReq.add(new Material("Papyrus", 1));
        thirdLevelHalicarnassusReq.add(new Material("Glass", 1));

        ArrayList<Material> earningOfHalicarnassusLev1 = new ArrayList<Material>();//özel durum
        earningOfHalicarnassusLev1.add(new Material("Civilian", 2));
        ArrayList<Material> earningOfHalicarnassusLev2 = new ArrayList<Material>();//buraya özel fonksiyon gerekecek özel durum var
        earningOfHalicarnassusLev2.add(new Material("Civilian", 1));

        ArrayList<Material> earningOfHalicarnassusLev3 = new ArrayList<Material>();//özel durum

        City halicarnassus = new City("The Mausoleum of Halicarnassus", earningsOfHalicarnassus, 0, firstLevelHalicarnassusReq, secondLevelHalicarnassusReq,
                thirdLevelHalicarnassusReq, new ArrayList<Material>(), earningOfHalicarnassusLev1, earningOfHalicarnassusLev2, earningOfHalicarnassusLev3,
                new ArrayList<Material>(),"halikarnassusB.png", 1);

        citiesB.add(halicarnassus);





        ArrayList<Material> earningsOfGiza  = new ArrayList<Material>();
        earningsOfGiza.add(new Material("Stone",1));

        ArrayList<Material> firstLevelGizaReq = new ArrayList<Material>();
        firstLevelGizaReq.add(new Material("Wood", 2));
        ArrayList<Material> secondLevelGizaReq = new ArrayList<Material>();
        secondLevelGizaReq.add(new Material("Stone", 3));
        ArrayList<Material> thirdLevelGizaReq = new ArrayList<Material>();
        thirdLevelGizaReq.add(new Material("Clay", 3));
        ArrayList<Material> fourthLevelGizaReq = new ArrayList<Material>();
        fourthLevelGizaReq.add(new Material("Stone", 4));
        fourthLevelGizaReq.add(new Material("Papyrus", 1));

        ArrayList<Material> earningOfGizaLev1 = new ArrayList<Material>();
        earningOfGizaLev1.add(new Material("Civilian", 3));
        ArrayList<Material> earningOfGizaLev2 = new ArrayList<Material>();
        earningOfGizaLev2.add(new Material("Civilian", 5));
        ArrayList<Material> earningOfGizaLev3 = new ArrayList<Material>();
        earningOfGizaLev3.add(new Material("Civilian", 5));
        ArrayList<Material> earningOfGizaLev4 = new ArrayList<Material>();
        earningOfGizaLev4.add(new Material("Civilian", 7));

        City giza = new City("The Pyramids of Giza", earningsOfGiza, 0, firstLevelGizaReq, secondLevelGizaReq,
                thirdLevelGizaReq, fourthLevelGizaReq, earningOfGizaLev1, earningOfGizaLev2, earningOfGizaLev3,
                earningOfGizaLev4,"gizahB.png", 1);

        citiesB.add(giza);


        Collections.shuffle(citiesB);

    }

    /**
     * This method forms the last state of cities. For instance, createACities and createBCities creates
     * all 7 cities without knowing how many cities were chosen by player. After invoking createACities or createBCities,
     * this method should be called, it will removed cities which will not be used in the current game.
     * @param numberOfPlayers
     * @param chosenCity
     * @param boardType
     */
    public void arrangeCities(int numberOfPlayers, String chosenCity, boolean boardType)
    {
        for(int i = 6; 0 <= i; i--)
        {
            if(boardType == true)//A side
            {
                if(citiesA.size() != numberOfPlayers && citiesA.get(i).getBoardName() != chosenCity)
                {
                    citiesA.remove(i);
                }
            }
            else
            {
                if(citiesB.size() != numberOfPlayers && citiesB.get(i).getBoardName() != chosenCity)
                {
                    citiesB.remove(i);
                }
            }
        }
    }

    /**
     * This method returns the city object which is played by Player
     * @param boardType
     * @param cityName
     * @return chosenCity
     */
    public City getPlayerCity(int boardType, String cityName)
    {
        City chosenCity = null;

        if(boardType == 0)
        {
            for(int i = 0; i < citiesA.size(); i++)
            {
                if(cityName == citiesA.get(i).getBoardName())
                {
                    chosenCity = citiesA.get(i);
                }
            }
        }
        else
        {
            for(int i = 0; i < citiesB.size(); i++)
            {
                if(cityName == citiesB.get(i).getBoardName())
                {
                    chosenCity = citiesB.get(i);
                }
            }
        }
        return chosenCity;
    }

    public int getNumberOfCities(int boardType)
    {
        if(boardType == 0)
            return citiesA.size();
        else
            return citiesB.size();
    }

    public ArrayList<City> getCitiesA()
    {
        return citiesA;
    }

    public ArrayList<City> getCitiesB()
    {
        return citiesB;
    }
    public void changeCityStage(City city)
    {

        city.setBoardLevel(city.getBoardLevel()+1);
    }
    public void printCities(ArrayList<City> cardPrint)
    {
        for(int i = 0; i < cardPrint.size(); i++){
            cardPrint.get(i).print();
        }
    }
}
