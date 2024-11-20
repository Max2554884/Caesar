
public class Viginere {

    private String kt;
    private String S;
    private String gt;

    //Der Konstruktor hat keinen Rückgabetyp!!!!!
    public Viginere() {
        //Wenn die Attribute initalisiert werden behbet man den null Wert anzeige
        kt = "";
        gt = "";
        S = "";
    }

    public void verschluesseln() {
        for (int i = 0; i < kt.length(); i++) {
           int h = this.zahlenZuBuchstaben(kt.charAt(i));
            int j = this.BuchstabenZuZahlen(S.charAt(i%S.length()));
            gt = gt + this.BuchstabenZuZahlen(h + S);
        }
    }

    public void entschluesseln() {
        for (int i = 0; i < gt.length(); i++) {
            char buchstabe = gt.charAt(i);
            char schluessel = S.charAt(i % S.length());
            int verschiebung = BuchstabenZuZahlen(schluessel) - 'A';
            char entschluesselt = getChar((BuchstabenZuZahlen(buchstabe) - verschiebung + 26) % 26 + 'A');
            kt += entschluesselt;
        }
    }

    private char zahlenZuBuchstaben(int pWert){
        return (char) pWert;
    }

    private int  BuchstabenZuZahlen(){
          return (int) pWert;

    }



    public void setKt(String pWert) {
        this.kt = pWert;
    }

    public String getGt() {
        return gt;
    }

    //Wert muss auch gesetzt werden!
    public void setGt(String pgt){

    }

    private char getChar(int pWert) {
        return (char) pWert;
    }

    //Wenn die Methode für andere Objekte aufrufbar sein soll, muss der die Sichtbarkeit public sein!
    public void setS(String pWert) {
        S = pWert;
    }
    public String getS(char pWert) {
        return (char) pWert;
    }

    public String getgt() {
        return gt;
    }


    }
}
