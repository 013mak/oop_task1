package Seminars.Seminar1.impl;
import Seminars.Seminar1.Product;

import java.time.LocalDate;
public class BottleOfWater extends Product {
    private int volume;
    private String pack;
    private boolean isSpark;


    public BottleOfWater(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = 0;
        this.pack = Package.PLASTIC.getMaterial();

    }

    public BottleOfWater(String name, double price, LocalDate releaseDate, boolean spark, String pack, int volume) {
        super(name, price, releaseDate);
        this.isSpark = false;
        this.volume = volume;
        this.pack = pack;

    }

    public int getVolume() {
        return volume;
    }

    public String getPack() {
        return pack;
    }

    public boolean isSpark() {
        return isSpark;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", volume=" + volume +
                ", pack='" + pack + '\'' +
                ", isSpark=" + isSpark +
                '}';
    }
}
