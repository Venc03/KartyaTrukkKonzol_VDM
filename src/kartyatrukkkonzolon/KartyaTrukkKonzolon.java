package kartyatrukkkonzolon;

import java.util.Scanner;

public class KartyaTrukkKonzolon {

    //  private static String[] pakli = new String[22];
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Pakli alap = new Pakli();
        String pakli [] = alap.pakli;
        for (int i = 1; i < 4; i++) {
            int oszlop = melyik();
            Pakli kevert = new Pakli(pakli, oszlop, i);
            pakli = kevert.pakli;
        }
    }

    private static int melyik() {
        boolean jo;
        int oszlop;
        do {
            System.out.print("melyik oszlop (1-3): ");
            oszlop = sc.nextInt();
            jo = oszlop >= 1 && oszlop <= 3;
        } while (!jo);
        return oszlop;

    }
   
}