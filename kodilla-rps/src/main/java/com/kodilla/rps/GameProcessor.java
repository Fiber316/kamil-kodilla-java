package com.kodilla.rps;

public class GameProcessor {
    private Game game;

    public GameProcessor(Game game) {
        this.game = game;
    }

    public void play(){
        while(game.getPlayer1().getScore() >= game.getRound()
        || game.getPlayer2().getScore() >= game.getRound()){

        }
    }
}
