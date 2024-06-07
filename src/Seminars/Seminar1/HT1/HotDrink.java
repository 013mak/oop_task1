package Seminars.Seminar1.HT1;

import Seminars.Seminar1.Product;

import java.time.LocalDate;

public class HotDrink extends Product {


    public HotDrink(String name, double price, LocalDate releaseDate, int temperature, int volume) {
        super(name, price, releaseDate);
        this.temperature = temperature;
        this.volume = volume;
    }

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temperature = 90;
        this.volume = 0;
    }


}