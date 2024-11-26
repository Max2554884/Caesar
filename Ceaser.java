public class Ceaser {

    private String kt;
    private int S;
    private String gt;

    //Der Konstruktor hat keinen Rückgabetyp!!!!!
    public Ceaser(){
        //Wenn die Attribute initalisiert werden behbet man den null Wert anzeige
        kt ="";
        gt="";
        S=0;
    }

    public void verschluesseln (){
        for(int i = 0;i < kt.length();i++){
           int h = this.getASCII(kt.charAt(i));
            gt = gt + this.getChar(h + S);
       }
    }
    public void entschluesseln (){
        for (int i = 0; i <gt.length() ; i++){
            int h = this.getASCII(gt.charAt(i));
            kt = kt + this.getChar(h - S);
        }
    }
    public int getASCII (char pWert)
    {
        return(int)pWert;
    }

    public void setKt(String pWert) {
        this.kt = pWert;
    }

    public String getkt ()
    {
        return kt;
    }

    //Wert muss auch gesetzt werden!
    public void setS (int pWert){S=pWert;}
    private char getChar(int pWert)
    {
        return (char)pWert;
    }
    //Wenn die Methode für andere Objekte aufrufbar sein soll, muss der die Sichtbarkeit public sein!
    public int getS(char pWert)
    {
        return (int)pWert;
    }
    public String getgt(){
        return gt;
    }
    public void setGt(String pWert){
        this.gt=pWert;}
}
