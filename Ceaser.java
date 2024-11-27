public class Ceaser extends Kryptomat{



    private int S;


    //Der Konstruktor hat keinen Rückgabetyp!!!!!
    public Ceaser(){
        //Wenn die Attribute initalisiert werden behbet man den null Wert anzeige
        super();
        S=0;
    }

    public void verschluesseln (){
        for(int i = 0;i < kt.length();i++){
           int h = this.getAscii(kt.charAt(i));
            gt = gt + this.getChar(h + S);
       }
    }
    public void entschluesseln (){
        for (int i = 0; i <gt.length() ; i++){
            int h = this.getAscii(gt.charAt(i));
            kt = kt + this.getChar(h - S);
        }
    }






    //Wert muss auch gesetzt werden!
    public void setS (int pWert){S=pWert;}

    public int getS()
    {
        return S;
    }

}
