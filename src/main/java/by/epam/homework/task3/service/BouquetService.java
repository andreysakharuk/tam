package by.epam.homework.task3.service;


import by.epam.homework.task3.entity.Flower;

import java.util.ArrayList;

public class BouquetService {


    public int countBouquetPrice(ArrayList<Flower> bouquetFilled){
        int cost = 0;
        for (Flower flower: bouquetFilled){
            cost = cost + flower.getPrice();
        }
        return cost;
    }


}
