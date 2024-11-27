
public class Viginere extends Kryptomat{


    private String S;


    //Der Konstruktor hat keinen Rückgabetyp!!!!!
    public Viginere() {
        //Wenn die Attribute initalisiert werden behbet man den null Wert anzeige
        super();
        S = "";
    }

    public void verschluesseln() {
        for (int i = 0; i < kt.length(); i++) {
            int h = this.getChar(kt.charAt(i));
            int j = this.getAscii(S.charAt(i))-65;
            gt = gt + this.getChar((char) (h + j));
        }
    }

    public void entschluesseln() {
        for (int i = 0; i < gt.length(); i++) {
            int n = this.getAscii(gt.charAt(i));
            int m = this.getAscii(S.charAt(i));
            kt = kt + this.getChar(n - m);
        }
    }




    //Wenn die Methode für andere Objekte aufrufbar sein soll, muss der die Sichtbarkeit public sein!
    public void setS(String pSchluessel) {
        S = pSchluessel;
    }

    public String getS() {
        return S;
    }


}

