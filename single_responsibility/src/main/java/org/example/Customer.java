package org.example;

import java.util.List;

public class Customer {
    private String name;
    private int age;
    private long bill;
    private List<Item> listsOfItems;

    Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBill() {
        return bill;
    }

    public void setBill(long bill) {
        this.bill = bill;
    }

    public List<Item> getListsOfItems() {
        return listsOfItems;
    }

    public void setListsOfItems(List<Item> listsOfItems) {
        this.listsOfItems = listsOfItems;
    }
}
