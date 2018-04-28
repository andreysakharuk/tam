package by.epam.homework.task3.entity;

public abstract class Flower {

    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private int price;
    private String color;

    public Flower(String name, int price, String color){
        this.name = name;
        this.price = price;
        this.color = color;
    }



}
