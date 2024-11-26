
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
            int j = this.BuchstabenZuZahlen(S.charAt(i));
            gt = gt +this.zahlenZuBuchstaben((char) (h+j));
        }
    }

    public void entschluesseln() {
        for (int i = 0; i < gt.length(); i++) {
            int n = this.BuchstabenZuZahlen(gt.charAt(i));
            int m = this.BuchstabenZuZahlen(S.charAt(i));
            kt = kt + this.zahlenZuBuchstaben(n - m);
        }
    }

    private char zahlenZuBuchstaben(int pWert){
        return (char) pWert;
    }

    private int  BuchstabenZuZahlen(char pWert){
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
        this.gt = pgt;

    }
    //Wenn die Methode für andere Objekte aufrufbar sein soll, muss der die Sichtbarkeit public sein!
    public void setS(String pSchluessel) {
        S = pSchluessel;
    }

    public String getS(){
        return S;
    }
    public String getkt(){
        return kt;
    }

    }

