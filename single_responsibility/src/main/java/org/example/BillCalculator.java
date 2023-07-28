package org.example;

import java.util.List;

public class BillCalculator {

    public long calculateBill(Customer customer, long tax) {
        long bill = 0;
        List<Item> listOfItems = customer.getListsOfItems();

        for(Item item : listOfItems) {
            bill += item.getPrice();
        }

        bill += tax;
        customer.setBill(bill);
        return bill;
    }
}
