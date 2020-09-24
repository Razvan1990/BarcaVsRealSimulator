package winner;

import implementation.ImplementMethods;
import implementation.SeasonStatsBarca;
import implementation.SeasonStatsReal;
import initialization.InitializeThings;

import java.util.ArrayList;
import java.util.List;

public class NumberPointsTeam {

    private ImplementMethods implementMethods;
    private SeasonStatsBarca seasonStatsBarca;
    private SeasonStatsReal seasonStatsReal;
    private InitializeThings initializeThings;

    public NumberPointsTeam() {

    }

    public NumberPointsTeam(InitializeThings initializeThings, ImplementMethods implementMethods, SeasonStatsReal seasonStatsReal, SeasonStatsBarca seasonStatsBarca) {
        this.implementMethods = implementMethods;
        this.initializeThings = initializeThings;
        this.seasonStatsBarca = seasonStatsBarca;
        this.seasonStatsReal = seasonStatsReal;
    }

    public int barcaPoints(int a, int b) {
        ImplementMethods implementMethods = new ImplementMethods();
        SeasonStatsBarca seasonStatsBarca = new SeasonStatsBarca();
        InitializeThings initializeThings = new InitializeThings();
        int nrPoints = 0;

        List<Integer> barca = new ArrayList<>();

        try {
           // int z = initializeThings.halfSeasonAllSeasonUserInputRounds();
            if (a == 3) {
                //int x = initializeThings.numberOfRounds();

                barca = seasonStatsBarca.calculateResultsBarca(a, b);


            } else {
                barca = seasonStatsBarca.calculateResultsBarca(a, 0);


            }


            for (int i = 0; i < barca.size() - 1; i += 2) {
                if (i < 38) {
                    if (barca.get(i) > barca.get(i + 1)) {
                        nrPoints += 3;

                    } else if (barca.get(i) == barca.get(i + 1)) {
                        nrPoints += 1;

                    } else {
                        System.out.print("");

                    }

                } else {
                    if (barca.get(i) > barca.get(i + 1)) {
                        nrPoints += 0;
                    } else if (barca.get(i) == barca.get(i + 1)) {
                        nrPoints += 1;
                    } else {
                        nrPoints += 3;
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nrPoints;
    }


    public int realPoints(int a, int b) {
        ImplementMethods implementMethods = new ImplementMethods();
        SeasonStatsReal seasonStatsReal = new SeasonStatsReal();
        InitializeThings initializeThings = new InitializeThings();
        int nrPoints = 0;


        List<Integer> real = new ArrayList<>();
        try {
           // int z = initializeThings.halfSeasonAllSeasonUserInputRounds();
            if (a == 3) {
                //int x = initializeThings.numberOfRounds();

                real = seasonStatsReal.calculateResultsReal(a, b);


            } else {
                real = seasonStatsReal.calculateResultsReal(a, 0);

            }


            for (int i = 0; i < real.size() - 1; i += 2) {
                if (i < 38) {
                    if (real.get(i) > real.get(i + 1)) {

                        nrPoints += 3;
                    } else if (real.get(i) == real.get(i + 1)) {
                        nrPoints += 1;

                    } else {
                        System.out.print("");

                    }

                } else {
                    if (real.get(i) > real.get(i + 1)) {
                        nrPoints += 0;
                    } else if (real.get(i) == real.get(i + 1)) {
                        nrPoints += 1;
                    } else {
                        nrPoints += 3;
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return nrPoints;
    }
}
