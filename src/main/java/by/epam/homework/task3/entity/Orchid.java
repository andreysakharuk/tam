package by.epam.homework.task3.entity;


public class Orchid extends Flower{

    private boolean allergicSmell;

    public Orchid(String name, int price, String color, boolean allergicSmell){
        super(name, price, color);
        this.allergicSmell = allergicSmell;
    }
}
