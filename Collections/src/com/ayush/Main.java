package com.ayush;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);

        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

        printList(theatre.seats);

        List<Theatre.Seat> priceSeat = new ArrayList<>(theatre.getSeats());
        priceSeat.add(theatre.new Seat("B00", 13));
        priceSeat.add(theatre.new Seat("A00", 13));
//        Collections.sort(priceSeat, Theatre.PRICE_ORDER);
        priceSeat.sort(Theatre.PRICE_ORDER);
        printList(priceSeat);


//        Collections.reverse(seatCopy); //shuffle
//        System.out.println("Printing seatCopy");
//        printList(seatCopy);
//        System.out.println("Printing theatre.seats");
//        printList(theatre.seats);
//
//        Theatre.Seat minSeat = Collections.min(seatCopy);
//        Theatre.Seat maxSeat = Collections.max(seatCopy);
//
//        System.out.println("Min Seat = " + minSeat + " Max Seat = " + maxSeat);


//        theatre.getSeats();
//        if (theatre.reserveSeat("H11")) {
//            System.out.println("Please pay ");
//        } else {
//            System.out.println("Sorry,seat is taken");
//        }

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================================================================");
    }
}
