package com.ayush;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//      adelaideCrows.addPlayer(pat);
//      adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayer());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

//      error because specified the bound in Team
//      Team<String> brokeTeam = new Team<>("this wont work");
//      brokeTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("Real Madrid");
        soccerTeam.addPlayer(beckham);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);

//        error because we changed the parameter to generic type
//        adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("Rankings");

        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(hawthorn.compareTo(melbourne));
        System.out.println(melbourne.compareTo(hawthorn));
    }
}
