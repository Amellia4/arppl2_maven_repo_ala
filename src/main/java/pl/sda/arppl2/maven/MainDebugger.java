package pl.sda.arppl2.maven;

public class MainDebugger {
    public static void main(String[] args) {
        //######################################
        //deklaracje:
        //zmienna z wartoscia ktora jest zmienna calkowita
        int a;

        //zmienna z wartoscią która jest liczba zmienno-przecinkowa
        //duzej precyzji 20 miejsc po przecinku (zajmuje 64 bity)
        double b;
        //malej precyzji d0 10 po przecinku (32 bity)
        float c;
        Float cc;

        //tekst
        String zmiennaZTekstem;
        //##############################

        //deklaracje z inicjalizacja
        int zmiennaCalkowita = 5;

        zmiennaCalkowita = zmiennaCalkowita + 10;
        zmiennaCalkowita = zmiennaCalkowita *23;
        zmiennaCalkowita = zmiennaCalkowita / 7;
        zmiennaCalkowita = zmiennaCalkowita +10;

        System.out.println("zmiennCalkowita");//tekst
        System.out.println(zmiennaCalkowita);//wartosc
        System.err.println("to jest inny wypis");    }

}
