public abstract class  Kryptomat {

    //Attribute der Abstrakten- Klasse
    protected String gt;
    private String kt;



    //Konstruktor
    public Kryptomat(){

    }
    //verschlüsselt den Kt
    public void  verschlusseln(){

    }
    //entschlüsselt den Gt
    public void entschluesseln(){

    }
    // Wandelt Zahlen in Buchstaben um
    private char getChar(int pWert){

        return (char) pWert;
    }
    //Wandelt Buchstaben in Zahlen um
    private int getAscii(char pWert){
        return (int) pWert;
    }
    public String getgt(){
        return gt;
    }
    public void  setgt(String pGt){
        gt = pGt;
    }
    public String getKt(){
        return kt;
    }
    public void setKt(String pKt) {
        kt = pKt;
    }



