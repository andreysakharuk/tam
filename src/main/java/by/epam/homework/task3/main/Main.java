package by.epam.homework.task3.main;

import by.epam.homework.task3.entity.Bouquet;
import by.epam.homework.task3.entity.Flower;
import by.epam.homework.task3.entity.Lily;
import by.epam.homework.task3.entity.Orchid;
import by.epam.homework.task3.entity.Rose;
import by.epam.homework.task3.service.BouquetService;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        Bouquet bouquet = new Bouquet();
        bouquet.addFlowerToBouquet(new Rose("роза", 43, "красный", true));
        bouquet.addFlowerToBouquet(new Rose("роза", 40, "белый", true));
        bouquet.addFlowerToBouquet(new Rose("роза", 40, "желтый", true));
        bouquet.addFlowerToBouquet(new Lily("роза", 40, "белый",true));
        bouquet.addFlowerToBouquet(new Orchid("орхидея", 50, "белый", true));
        ArrayList<Flower> bouquetFilled = bouquet.getBouquet();
        BouquetService bouquetService = new BouquetService();
        System.out.println(bouquetService.countBouquetPrice(bouquetFilled));

    }
}
