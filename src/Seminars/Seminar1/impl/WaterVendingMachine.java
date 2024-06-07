package Seminars.Seminar1.impl;

import Seminars.Seminar1.Product;
import Seminars.Seminar1.VendingMachine;

import java.util.List;

public class WaterVendingMachine extends VendingMachine {
    public WaterVendingMachine() {
    }

    public WaterVendingMachine(List<Product> products) {
        super(products);
    }

}