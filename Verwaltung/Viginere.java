package Verwaltung;


import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner ;
    private Veginere ceaser;

    public static void main(String[] args){new Verwaltung();}

    public Verwaltung() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Ceaser Verschluesseln");
            System.out.println("[2] Ceaser entschluesseln");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Gib das zu verschlüsselnde Wort:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den schlüssel an");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                ceaser = new ceaser();
                //Methode falsch benannt
                this.ceaser.setKt(zeichenkette);
                this.ceaser.setS(schluessel);
                System.out.println("=======Klartext=======");
                System.out.println(this.ceaser.getkt());
                this.ceaser.verschluesseln();
                System.out.println("=========Geheimtext=========");
                System.out.println(this.ceaser.getgt());


            } else if (option == 2) {

                this.ceaser.entschluesseln();
                System.out.println(this.ceaser.getkt());
            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }
    }
}

