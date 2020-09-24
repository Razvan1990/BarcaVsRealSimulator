package winner;

import java.util.HashMap;
import java.util.Map;

public class Rankings {

    public void checkLeagueWinner(String Barca, String Real, int barcaPoints, int realPoints) {

        if (barcaPoints > realPoints) {
            System.out.println("Locul 1: "+Barca+" - "+barcaPoints+" puncte.");
            System.out.println("Locul 2: "+Real+" - "+realPoints+" puncte.");
        } else {
            System.out.println("Locul 1: "+Real+" - "+realPoints+" puncte.");
            System.out.println("Locul 2: "+Barca+" - "+barcaPoints+" puncte.");
        }


    }
}

