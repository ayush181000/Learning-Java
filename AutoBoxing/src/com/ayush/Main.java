package com.ayush;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));

        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); //autoboxing
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(intArrayList.get(i).intValue()); //unboxing
        }

        Integer myValue = 56;  // 56 --> Integer.valueOf(56) during compile time
        int myInt = myValue;   // myValue --> myValue.intValue();
    }
}
