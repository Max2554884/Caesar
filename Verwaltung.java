public class Verwaltung {
    private Scanner scanner ;
    private Ceaser ceaser;
    public static void main(string[] args){new Verwaltung();}

    public Verwaltung() {
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("== HAUPTMENÜ ==");
            System.out.println("[1] Ceaser Verschluesseln");
            System.out.println("[2] Ceaser entschluesseln");

            int option = scanner.nextInt();
            scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
            if (option == 1) {
                System.out.println("Gib das zu verschlüsselnde Wort:");
                String zeichenkette = scanner.nextLine();
                System.out.println("Gib den schlüssel an");
                String schluesselstring = scanner.nextLine();
                int schluessel = integer.parseInt(schluesselstring ceaser = new ceaser);
                this.ceaser.setKt(zeichenkette);
                this.ceaser.setS(schluessel);

            } else if (option == 2) {
                // this.sendMessage();
                System.out.println("Gib die Zeichenkette für den Palindromtest an:");
                String zeichenkette = scanner.nextLine();
                this.test.setEingabe(zeichenkette);
                this.test.palindromTest();
                System.out.println("Ist dein Wort ein Palindrom? Die Antwort lautet: "+this.test.isIstPalindrom());
            }
            else if (option == 0) {
                break;
            }
            System.out.println();
        }
    }
}
