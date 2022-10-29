package za.co.bmw.workshop.day.two;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GenerateRandomNames {

    private static List<String> namesVault = List.of("Nonhlanhla Kuma", "Mike Robertso", "Fiona Brin", "Darren Moos", "Carmen Simela",
            "Boitumelo Alli", "Ronel Hoose", "Simone Robertso", "sello Chauk", "Paul Jouber", "sello Pete",
            "Ntokozo Beuke", "Julian Marai", "Nozipho Mulde", "Norman Siband", "Heather Mlangen", "Charles Delpor",
            "Muhammad Masang", "Johann Bennet", "Andre Mashab", "Musa Modis", "Sarah Mngomezul", "Teboho Wessel");
    ;

    public static List getRandomNames(){

        ArrayList randomList = new ArrayList();
        int size = namesVault.size();

        Random ran = new Random();
        int randomNumber;

        for (int val = 0; val < size; val++){
            randomNumber = ran.nextInt(size) + 0;
            randomList.add(namesVault.get(randomNumber));
        }

        return randomList;

    }

    public static String convertListToJSON(){
        List randomList = getRandomNames();
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(randomList);

        return prettyJson;

    }

    public static String convertDBDataToJSON(List<Developer> list){
        Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
        String prettyJson = prettyGson.toJson(list);

        return prettyJson;

    }


}
