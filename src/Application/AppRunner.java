package Application;

import implementation.ImplementMethods;
import implementation.SeasonStatsBarca;
import implementation.SeasonStatsReal;

import winner.NumberPointsTeam;
import initialization.InitializeThings;
import winner.Rankings;

import java.util.List;

public class AppRunner {

    private ImplementMethods implementMethods;
    private InitializeThings initializeThings;
    private NumberPointsTeam numberPointsTeam;
    private Rankings rankings;


    AppRunner(ImplementMethods implementMethods, InitializeThings initializeThings, NumberPointsTeam numberPointsTeam, Rankings rankings) {
        this.implementMethods = implementMethods;
        this.initializeThings = initializeThings;
        this.numberPointsTeam = numberPointsTeam;
        this.rankings = rankings;
    }

    public AppRunner() {
    }

    public void simulateApplication() {
        try {
            NumberPointsTeam numberPointsTeam = new NumberPointsTeam();
            SeasonStatsBarca seasonStatsBarca = new SeasonStatsBarca();
            SeasonStatsReal seasonStatsReal = new SeasonStatsReal();
            InitializeThings initializeThings = new InitializeThings();
            Rankings rankings = new Rankings();

            System.out.println("Welcome to the virtual ranking simulator.Please select the team or the clash.");
            System.out.println("1.Barcelona");
            System.out.println("2.Real Madrid");
            System.out.println("3.BarcaVsReal");

            int userOption = initializeThings.userOption();
            while (userOption > 3) {
                System.out.println("Not a valid option. Choose again");
                userOption = initializeThings.userOption();
            }
            switch (userOption) {
                case 1:
                    System.out.println("Please select how much you want to simulate");
                    System.out.println("1.Half Season");
                    System.out.println("2.AllSeason");
                    System.out.println("3.NumberOfRounds");

                    int a = initializeThings.halfSeasonAllSeasonUserInputRounds();

                    switch (a) {
                        case 1:
                            int first = numberPointsTeam.barcaPoints(a, 0);
                            System.out.println("Barca are " + first + " puncte.");
                            break;
                        case 2:
                            int second = numberPointsTeam.barcaPoints(a, 0);
                            System.out.println("Barca are " + second + " puncte.");
                            break;
                        case 3:

                            int b = initializeThings.numberOfRounds();
                            int third = numberPointsTeam.barcaPoints(a, b);
                            System.out.println("Barca are " + third + " puncte.");
                            break;
                        default:
                            break;

                    }
                    break;
                case 2:
                    System.out.println("Please select how much you want to simulate");
                    System.out.println("1.Half Season");
                    System.out.println("2.AllSeason");
                    System.out.println("3.NumberOfRounds");

                    a = initializeThings.halfSeasonAllSeasonUserInputRounds();

                    switch (a) {
                        case 1:
                            int first = numberPointsTeam.realPoints(a, 0);
                            System.out.println("Real are " + first + " puncte.");
                            break;
                        case 2:
                            int second = numberPointsTeam.realPoints(a, 0);
                            System.out.println("Real are " + second + " puncte.");
                            break;
                        case 3:
                            int b = initializeThings.numberOfRounds();
                            int third = numberPointsTeam.realPoints(a, b);
                            System.out.println("Real are " + third + " puncte.");
                            break;
                        default:
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Please select how much you want to simulate");
                    System.out.println("1.Half Season");
                    System.out.println("2.AllSeason");
                    System.out.println("3.NumberOfRounds");

                    a = initializeThings.halfSeasonAllSeasonUserInputRounds();

                    switch (a) {
                        case 1:
                            int halfBarca = numberPointsTeam.barcaPoints(a, 0);
                            System.out.println();
                            int halfReal = numberPointsTeam.realPoints(a, 0);
                            System.out.println();
                            rankings.checkLeagueWinner("Barcelona", "Real Madrid", halfBarca, halfReal);
                            break;

                        case 2:
                            int fullBarca = numberPointsTeam.barcaPoints(a, 0);
                            System.out.println();
                            int fullReal = numberPointsTeam.realPoints(a, 0);
                            System.out.println();
                            rankings.checkLeagueWinner("Barcelona", "Real Madrid", fullBarca, fullReal);
                            break;

                        case 3:
                            int b = initializeThings.numberOfRounds();
                            int userInputBarca = numberPointsTeam.barcaPoints(a, b);
                            System.out.println();
                            int userInputReal = numberPointsTeam.realPoints(a, b);
                            System.out.println();
                            rankings.checkLeagueWinner("Barcelona", "Real", userInputBarca, userInputReal);
                            break;
                        default:
                            break;


                    }
                    break;



            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
