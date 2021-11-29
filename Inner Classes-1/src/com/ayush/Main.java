package com.ayush;

public class Main {

    public static void main(String[] args) {
        Gearbox mclaren = new Gearbox(6);
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));
        mclaren.operateClutch(true);
        mclaren.changeGear(3);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(6000));
    }
}
