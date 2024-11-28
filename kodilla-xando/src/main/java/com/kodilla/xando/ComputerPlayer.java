package com.kodilla.xando;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random randomGenerator = new Random();

    public ComputerPlayer() {
        super("ComputerPlayer");
    }


    @Override
    public int getMove() {
        return 0;
    }
}
