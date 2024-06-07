package Seminars.Seminar1;

import Seminars.Seminar1.HT1.HDWendingMachine;
import Seminars.Seminar1.HT1.HotDrink;
import Seminars.Seminar1.impl.BottleOfWater;
import Seminars.Seminar1.impl.Package;
import Seminars.Seminar1.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Product bottle1 = new BottleOfWater("Саяны", 50, LocalDate.of(2024, 5, 1));
//        Product bottle2 = new BottleOfWater("Саяныгаз", 50, LocalDate.of(2024, 5, 1), true, Package.GLASS.getMaterial(), 0.5F);
//
//        VendingMachine vm = new WaterVendingMachine();
//
//
//        System.out.println(vm.getProducts());
//        vm.addProducts(List.of(bottle1, bottle1, bottle2, bottle1, bottle2));
//        System.out.println(vm.getProducts());
//        vm.getProduct("Саяны");
//        System.out.println(vm.getProducts());


        Product hotdrink1 = new HotDrink("Кофе", 50, LocalDate.of(2024, 5, 6), 50, 1);
        Product hotdrink2 = new HotDrink("Чай", 30, LocalDate.of(2024, 5, 6), 90, 1);
        Product hotdrink3 = new HotDrink("Молоко", 90, LocalDate.of(2024, 5, 6), 80, 1);
        VendingMachine vm = new HDWendingMachine();


        System.out.println(vm.getProducts());
        vm.addProducts(List.of(hotdrink1, hotdrink1, hotdrink2, hotdrink3, hotdrink2, hotdrink3));
        System.out.println(vm.getProducts());
        vm.getProduct("Чай", 90, 1);
        System.out.println(vm.getProducts());

    }
}