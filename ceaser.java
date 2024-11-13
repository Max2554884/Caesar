public class ceaser {

    private String kt;
    private int S;
    private String gt;


    public void ceasar(){

    };
    public void verschluesseln (){
       for(int i = 0;i < kt.length()-1;i++){
           int h = this.getASCII(kt.charAt(i));
        gt = gt + this.getChar(h + S);
       }
    };
    public void entschluesseln (){
        for (int i = 0; i <gt.length()-1 ; i++); {
            int h = this.getASCII(gt.charAt(i));
            kt = kt + this.getChar(h - S);
        }

    }
    public int getASCII (char pWert)
    {
        return(int)pWert;
    };

    public void setKT (String pWert){}
    public String getkt ()
    {
        return kt;
    };
    public void setS (int pWert){}
    private char getChar(int pWert)
    {
        return (char)pWert;
    }
    private int getS(char pWert)
    {
        return (int)pWert;
    }
}
