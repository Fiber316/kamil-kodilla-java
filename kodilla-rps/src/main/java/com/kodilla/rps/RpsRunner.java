package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {

        String name = IOController.getPlayerName();
        int rounds = IOController.getRoundNumber();
        IOController.showGameInfo();

        Player humanPlayer = new HumanPlayer(name);
        Player computerPlayer = new ComputerPlayer();

        Game game = new Game(humanPlayer, computerPlayer, rounds);
        GameProcessor gameProcessor = new GameProcessor(game);
        gameProcessor.play();
    }
}
