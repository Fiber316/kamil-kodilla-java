package com.kodilla.rps;

public class Game {
    private Player player1;
    private Player player2;
    private int round;
    public Game(Player player1, Player player2, int round) {
        this.player1 = player1;
        this.player2 = player2;
        this.round = round;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public int getRound() {
        return round;
    }

    public int winner(int player1Move, int player2Move) {
        return -1;
    }

}
