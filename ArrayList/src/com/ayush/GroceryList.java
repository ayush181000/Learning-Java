package com.ayush;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void modifyGroceryItem(String curItem, String newItem) {
        int position = findItem(curItem);
        if (position > 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int index, String item) {
        groceryList.set(index, item);
        System.out.println(index + 1 + " item modified to " + item);
    }

    public void printGroceryItem() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 1; i < groceryList.size() + 1; i++) {
            System.out.println("Item " + i + ": " + groceryList.get(i - 1));
        }
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position > 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        if (findItem(searchItem) >= 0) {
            return true;
        } else
            return false;
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }
}
