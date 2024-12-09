public class Polybius extends Kryptomat {
    private int[][] alphabetQuadrat;

    public  Polybius() {
        super();
        bfms();
    }
    @Override
    //verschluesselung !
    public void verschluesseln() {
       gt="";
        for (int i = 0; i <kt.length() ; i++) {//ghet durch Klartext durch
            for (int j = 1; j < alphabetQuadrat.length ; j++) {// zeile
                for (int h = 1; h < alphabetQuadrat.length; h++) {//spalte
                    if (kt.charAt(i) ==alphabetQuadrat[j][h]) {//guckt ob bustabe an i kt entspricht enn jas j u h speichern
                        gt=gt+j+h;     //addet zeile und spalte zum Wert des gt

                }

                }
            }
      }
    }

    @Override
    public void entschluesseln() {
        kt="";
        for (int i = 0; i <gt.length() ; i++) {
            for (int j = 1; j <alphabetQuadrat.length; j++) {
                for (int k = 0; k < alphabetQuadrat.length ; k++) {
                    if (gt.charAt(i) == alphabetQuadrat[j][k]) {
                      kt=kt+j+k;
                    }
                }  
            }  
        }


    }

//befüllt beide dimensionene des arrays mit Buchstaben und legt den char wert fest
    public void bfms() {
        int a = 97;

        alphabetQuadrat= new int[6][6];
        for (int zeile = 1; zeile < alphabetQuadrat.length-1 ; zeile++) {
            for (int spalte = 1; spalte < alphabetQuadrat.length-1; spalte++) {
                if( a== 105){
                    a++;
                }
                alphabetQuadrat[zeile][spalte] = a;
                System.out.print(alphabetQuadrat[zeile][spalte]);
                a++;
             }
            System.out.println();
         }


    }



}