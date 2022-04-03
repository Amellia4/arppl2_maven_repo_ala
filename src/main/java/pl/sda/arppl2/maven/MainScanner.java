package pl.sda.arppl2.maven;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        System.out.println("Wpisz swoje imie: ");

        Scanner scanner = new Scanner(System.in);
        //deeklaracja zmiennej slowo i przypisanie wartosci ktora jest wynikiem funkicj nex z obiektu scannera
        String slowo = scanner.next();

        System.out.println("czesc "+slowo +", jestes najlepszym programista przy TEJ klawiaturze");

        System.out.println("podaj mi swoj wiek: ");
        //deklaracja zmiennej liczba i przypisanie do niej wartosci
        //ktora jest wynikiem funkcji nextint z obiektu scanner
        int liczba = scanner.nextInt();
        liczba =liczba/10;
        System.out.println("czy wiesz ze zyjesz juz "+ liczba+" dekat" );

    }
}
