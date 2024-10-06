package com.kodilla.rps;

import java.util.Scanner;

public class IOController {
    public static String getPlayerName() {
        System.out.print("Enter player name: ");
        Scanner sc = new Scanner(System.in);
        String playerName = sc.nextLine();
        return playerName;
    }
    public static int getRoundNumber() {
        System.out.print("Enter round number: ");
        Scanner sc = new Scanner(System.in);
        int roundNumber = sc.nextInt();
        return roundNumber;
    }
    public static void showGameInfo(){
        System.out.println("""
                klawisz 1 – zagranie "kamień",
                klawisz 2 – zagranie "papier",
                klawisz 3 – zagranie "nożyce",
                klawisz x – zakończenie gry poprzedzone pytaniem "Czy na pewno zakończyć grę?",
                klawisz n – uruchomienie gry od nowa poprzedzone pytaniem "Czy na pewno zakończyć aktualną grę?",
                """);
    }

}
