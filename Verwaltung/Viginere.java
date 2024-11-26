package Verwaltung;


import java.sql.SQLOutput;
import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner ;
    private Viginere Viginere;

    public static void main(String[] args){new Verwaltung();}

    public Verwaltung() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Ceaser Verschluesseln");
            System.out.println("[2] Ceaser entschluesseln");
            System.out.println("[3] Viginere Verschuesseln");
            System.out.println("[4] Viginere Entschuesseln");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                ceasar = new Ceasar();
                this.ceasar.setKt(zeichenkette);
                this.ceasar.setS(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(this.ceasar.getKt());
                this.ceasar.verschuesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.scanner.ceasar.getgt());



            }
            else if (option == 2) {
            System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
            String zeichenkette = scanner.nextLine();
            System.out.println("Gib den Schlüsseln an:");
            String schluesselString = scanner.nextLine();
            int S = Integer.parseInt(schluesselString);
            ceasar = new Ceasar();
            this.ceasar.setgt(zeichenkette);
            this.ceasar.setS(schluessel);
            System.out.println("========Geheimtext=====");
            System.out.println(zeichenkette);
            this.ceaesar.entschuesseln();
            System.out.println("========Klartext=====");
            System.out.println(this.ceasar.getKt());
            }
            else if (option == 0) {
                break;
            }
            else if (option == 3) {
            System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
            String zeichenkette = scanner.nextLine();
            System.out.println("Gib das Codewort an:");
            String schluesselString = scanner.nextLine();
            String schluessel =(schluesselString);
            Viginere = new Viginere();
            this.Viginere.setkt(zeichenkette);
            this.Viginere.setS(schluessel);
            System.out.println("========Klartext=====");
            System.out.println(zeichenkette);
            this.Viginere.verschlusseln();
            System.out.println("========Geheimtext=====");
            System.out.println(this.Viginere.getgt());

        } else if (option == 4) {

            System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
            String zeichenkette = scanner.nextLine();
            System.out.println("Gib das Codewort an:");
            String schluesselString = scanner.nextLine();
            String schluessel = (schluesselString);
            Viginere = new Viginere();
            this.Viginere.setgt(zeichenkette);
            this.Viginere.setschluessel(schluessel);
            System.out.println("========Geheimtext=====");
            System.out.println(zeichenkette);
            this.Viginere.entschlusseln();
            System.out.println("========Klartext=====");
            System.out.println(this.Viginere.getkt());


        }

    }
        }
    }
}

