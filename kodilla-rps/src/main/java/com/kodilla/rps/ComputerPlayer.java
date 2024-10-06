package com.kodilla.rps;

import java.util.Random;

public class ComputerPlayer extends Player {

    private Random randomGenerator = new Random();

    public ComputerPlayer() {
        super("ComputerPlayer", 0);
    }

    @Override
    public int getMove() {
        return randomGenerator.nextInt(3)+1;
    }
}
