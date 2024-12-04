public class Polybius extends Kryptomat {
    int[][] alphabetQuadrat;
    Polybius() {
        super();

    }
    @Override
    public void verschluesseln() {
      gt="";
      int k=0;
        for (int i = 1; i <kt.length() ; i++) {
            for (int j = 1; j <kt.length() ; j++) {
                if (kt.charAt(k) ==alphabetQuadrat[i][j]) {
                    gt=gt+i*10+j;
                    i=1;
                    j=1;
                    k++;
                }
        }
      }
    }

    @Override
    public void entschluesseln() {
   kt="";


    }







public void bfms() {


    char a = 97;
    alphabetQuadrat= new int[5][5];
    for (int zeile = 0; zeile < alphabetQuadrat.length-1 ; zeile++) {
        for (int spalte = 0; spalte < alphabetQuadrat.length-1; spalte++) {
        if( a== 105){
            a++;
        }
        }
    }


    }


}