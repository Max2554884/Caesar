import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner ;
    private Viginere viginere;
    private Ceaser ceaser;
    private Polybius polybius;

    public static void main(String[] args){new Verwaltung();}

    public Verwaltung() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Ceaser Verschluesseln");
            System.out.println("[2] Ceaser entschluesseln");
            System.out.println("[3] Viginere Verschuesseln");
            System.out.println("[4] Viginere Entschuesseln");
            System.out.println("[5] Polybius Verschluesseln");
            System.out.println("[6] Polybius Entschuesseln");
            System.out.println("[0] Beenden");
            int option = scanner.nextInt();
            scanner.nextLine();
            
            if (option == 1) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int schluessel = Integer.parseInt(schluesselString);
                ceaser = new Ceaser();

                this.ceaser.setKt(zeichenkette);
                this.ceaser.setS(schluessel);
                System.out.println("========Klartext=====");
                System.out.println(this.ceaser.getKt());
                this.ceaser.verschluesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.ceaser.getGt());



            }
            else if (option == 2) {
                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den Schlüsseln an:");
                String schluesselString = scanner.nextLine();
                int S = Integer.parseInt(schluesselString);
                ceaser = new Ceaser();
                this.ceaser.setGt(zeichenkette);
                this.ceaser.setS(S);
                System.out.println("========Geheimtext=====");
                System.out.println(zeichenkette);
                this.ceaser.entschluesseln();
                System.out.println("========Klartext=====");
                System.out.println(this.ceaser.getKt());
            }
            else if (option == 0) {
                break;
            }
            else if (option == 3) {
                System.out.println("Gib die Zeichenkette an, die verschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib das Codewort an:");
                String schluesselString = scanner.nextLine();
                viginere = new Viginere();
                this.viginere.setKt(zeichenkette);
                this.viginere.setS(schluesselString);
                System.out.println("========Klartext=====");
                System.out.println(zeichenkette);
                this.viginere.verschluesseln();
                System.out.println("========Geheimtext=====");
                System.out.println(this.viginere.getGt());

            } else if (option == 4) {

                System.out.println("Gib die Zeichenkette an, die entschuesseln werden soll:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib das Codewort an:");
                String schluesselString = scanner.nextLine();
                viginere = new Viginere();
                this.viginere.setGt(zeichenkette);
                this.viginere.setS(schluesselString);
                System.out.println("========Geheimtext=====");
                System.out.println(zeichenkette);
                this.viginere.entschluesseln();
                System.out.println("========Klartext=====");
                System.out.println(this.viginere.getKt());


            }
             else if (option== 5){
                System.out.println("Gib die zeichenkette an,die verschuesselt werden soll");
                String zeichenkette = scanner.nextLine();
                polybius = new Polybius();
                this.polybius.setKt(zeichenkette);
                this.polybius.verschluesseln();
                System.out.println("========Geheimtext========");

                System.out.println(this.polybius.getGt());
            }
             else if (option== 6){
                System.out.println("Gib die zeichenkette an,die entschluesselt  werden soll");

             }
        }
    }
}

