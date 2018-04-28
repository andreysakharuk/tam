package by.epam.homework.task3.entity;

public class Rose extends Flower{

    private boolean thorns;

    public Rose(String name, int price, String color, boolean thorns){
        super(name, price, color);
        this.thorns = thorns;
    }


}
