package com.kodilla.xando;

import java.util.Scanner;

public class IOController {
    public static String getPlayerName() {
        System.out.print("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        return playerName;
    }
    public static int GameMode() {
        System.out.print("""
                Wybierz tryb gry:
                1 - uloz 3 pod rzad na polu 3/3
                2 - uloz 5 pod rzad na polu 10/10
                """);
        Scanner sc = new Scanner(System.in);
        int gameMode = sc.nextInt();
        return gameMode;
    }


    //pokazuje jak
    public static void showGameInfo(){
        if (GameMode() == 3) {
            System.out.println("""
                    Zeby postawic swoj znak, wpisz liczbe odpowiadajaca polu na ktorym chcesz postawic:
                    |1|2|3|
                    |4|5|6|
                    |7|8|9|
                    Jesli chesz ponownie zobaczyc instrukcje, wpisz P""");
        } else if (GameMode() == 5) {

        } else {
            System.out.println("Game mode nie zostal jeszcze wybrany");
        }
    }

}
