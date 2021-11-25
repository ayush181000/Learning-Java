package com.ayush;

public class Main {

    public static void main(String[] args) {
        ITelephone ayushPhone;
        ayushPhone = new DeskPhone(123456);
        ayushPhone.powerOn();
        ayushPhone.callPhone(123456);
        ayushPhone.answer();

        ayushPhone = new MobilePhone(234567);
        ayushPhone.powerOn();
        ayushPhone.callPhone(234567);
        ayushPhone.answer();
    }
}
