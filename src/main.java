/**
 * Created by laurent on 1/18/17.
 */
public class main {

    public static void main(String[] args) {
        int beernum = 99;
        String mot = "bottles";

        while (beernum > 0 ) {
            if (beernum == 1) {
                mot = "bootle";
            }
            System.out.println (beernum + " " + mot + " of beer on the wall");
            System.out.println (beernum + " " + mot + " of beer" );
            System.out.println ("Take one down.");
            System.out.println ("Pass it around.");
            beernum = beernum - 1;

        }
        if (beernum > 0) {
            System.out.println(beernum + " " + mot + " of beer on the wall  - ttttttt");
        } else {
            System.out.println ("No more bottles of beer on the wall");
        }

    }

}
