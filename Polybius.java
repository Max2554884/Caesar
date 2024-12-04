public class Polybius extends Kryptomat {
    int[][] alphabetQuadrat;

    public  Polybius() {
        super();
        bfms();
    }
    @Override
    //verschluesselung !
    public void verschluesseln() {
       gt="";
        for (int i = 1; i <kt.length() ; i++) {//ghet durch Klartext durch
            for (int j = 1; j < alphabetQuadrat.length ; j++) {// zeile
                for (int h = 1; h < alphabetQuadrat.length; h++) {//spalte
                    if (kt.charAt(i) ==alphabetQuadrat[j][h]) {
                        gt=gt+j+h;

                }

                }
            }
      }
    }

    @Override
    public void entschluesseln() {
   kt="";


    }







//befüllt beide dimensionene des arrays mit Buchstaben und legt den char wert fest
    public void bfms() {
        char a = 97;
        alphabetQuadrat= new int[6][6];
        for (int zeile = 1; zeile < alphabetQuadrat.length-1 ; zeile++) {
            for (int spalte = 1; spalte < alphabetQuadrat.length-1; spalte++) {
                if( a== 105){
                    a++;
                }
             }
         }
         a++;

    }



}