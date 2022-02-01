package ru.netology.domain;

public class Smartphone extends Product {
    private String company;


    public Smartphone() {
        super();
    }


    public Smartphone(int id, String name, String company, int price) {
        super(id, name, price);
        this.company = company;
    }
}
