package by.epam.homework.task3.entity;


import java.util.ArrayList;

public class Bouquet {

    private ArrayList<Flower> bouquet;

    public Bouquet(){
        ArrayList<Flower> bouquet = new ArrayList<Flower>();
    }

    public void addFlowerToBouquet(Flower flower){
        bouquet.add(flower);
    }

    public ArrayList<Flower>getBouquet(){
        return bouquet;
    }

}
