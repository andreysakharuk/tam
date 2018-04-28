package by.epam.homework.task3.entity;

public class Lily extends Flower{

    public boolean pot;

    public Lily(String name, int price, String color, boolean pot){
        super(name, price, color);
        this.pot = pot;
    }
}
