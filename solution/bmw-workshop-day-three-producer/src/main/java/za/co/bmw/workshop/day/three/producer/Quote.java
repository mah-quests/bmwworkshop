package za.co.bmw.workshop.day.three.producer;

import javax.inject.Inject;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.Locale;
import java.util.Random;
import java.util.logging.Logger;


public class Quote {

    @Inject
    Logger logger;

    public String id;
    public int price;

    public String description;

    public String [] models = {"X1", "X2", "X3", "X4", "X5", "X6", "X7", "i3", "i7", "iX1", "iX3", "iX",
            "BMW 1 Series", "BMW 1 Series Coupé", "BMW 1 Series M Coupé", "BMW 218i Gran Coupé", "BMW 2 Series coupé",
            "BMW 1 Series Cabriolet","2020 BMW M235i xDrive Gran Coupé", "BMW 2 Series convertible", "BMW M2 Competition",
            "E21", "E30 coupé", "E36 sedan", "E46 sedan", "E90 sedan", "F30 sedan", "G20 sedan", "F80 M3", "BMW 4 Series coupé",
            "BMW 4 Series convertible","BMW 4 Series Gran Coupé", "BMW 4 Series coupé", "BMW 4 Series convertible", "BMW 4 Series Gran Coupé",
            "E12", "E28","E34", "E39", "E60", "F10", "G30","BMW 735i sedan", "BMW 750i sedan", "BMW 735i sedan", "Facelift BMW 730d",
            "BMW 730d", "BMW 740d", "BMW i7", "BMW 840Ci", "BMW 840d"
    };

    /**
     * Default constructor required for Jackson serializer
     */
    public Quote() { }

    public Quote(String id, int price) {
        this.id = id;
        this.price = price;
        this.description = modelAndPrice();
    }

    @Override
    public String toString() {

        return "Quote{" +
                "id='" + id + '\'' +
                "model is=" + description + '\n' +
                ", price=" + price +
                '}';
    }


    public String modelAndPrice(){

        Random rand = new Random();
        int upperbound = models.length -1;
        int arr_number = rand.nextInt(upperbound + 0) + 0;


        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        Currency currency = Currency.getInstance("ZAR");
        usFormat.setCurrency(currency);
        String formattedPrice = usFormat.format(this.price);

        LocalDateTime timeOfExecution = LocalDateTime.now();
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        return "Quote requested at " + timeOfExecution.format(myFormat) + " - [BMW " + models[arr_number] + " model, priced at " + formattedPrice +" ]";

    }
}