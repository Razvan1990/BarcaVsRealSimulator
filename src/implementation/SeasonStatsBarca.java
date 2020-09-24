package implementation;


import constant.VecConst;
import initialization.InitializeThings;
import winner.NumberPointsTeam;

import java.util.ArrayList;
import java.util.List;


public class SeasonStatsBarca {

    private ImplementMethods implementMethods;
    private NumberPointsTeam numberPointsTeam;


    public SeasonStatsBarca() {
    }

    public SeasonStatsBarca(ImplementMethods implementMethods, NumberPointsTeam numberPointsTeam) {
        this.implementMethods = implementMethods;
        this.numberPointsTeam = numberPointsTeam;
    }

    public List<Integer> calculateResultsBarca(int x, int z) {
        try {
            List<Integer> scoresList = new ArrayList<Integer>();
            ImplementMethods implementMethods = new ImplementMethods();
            InitializeThings initializeThings = new InitializeThings();
            List<Integer> list1 = implementMethods.barcaVsRivalScores();
            switch (x) {

                case 1:
                    int matchDay = 1;
                    for (int i = 0; i < (list1.size()-1) / 2; ) {
                        for (int j = 0; j < VecConst.teamArray.length; ) {
                            if (VecConst.teamArray[i].equals("Barcelona")) {
                                j++;
                                i++;
                            } else {

                                System.out.println("Round" + matchDay + ":" + " Barcelona " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
                                scoresList.add(list1.get(i));scoresList.add(list1.get(i+1));
                                j++;
                                i++;
                                matchDay++;

                            }
                        }
                    }
                    return scoresList;
                case 2:
                    int matchDay2 = 1;
                    for (int i = 0; i < (list1.size() - 1) / 2; ) {
                        for (int j = 0; j < VecConst.teamArray.length; ) {
                            if (VecConst.teamArray[i].equals("Barcelona")) {
                                j++;
                                i++;
                            } else {

                                System.out.println("Round" + matchDay2 + ":" + " Barcelona " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
                                scoresList.add(list1.get(i));scoresList.add(list1.get(i+1));
                                i++;
                                j++;
                                matchDay2++;

                            }
                        }
                    }
                    list1.removeAll(list1);
                    String[] reversedTeams = implementMethods.reversedTeamsArray(VecConst.teamArray);
                    list1 = implementMethods.barcaVsRivalScores();
                    for (int k = 0; k < (list1.size() - 1) / 2; ) {
                        for (int l = 0; l < reversedTeams.length; ) {
                            if (reversedTeams[l].equals("Barcelona")) {
                                k++;
                                l++;

                            } else {

                                System.out.println("Round" + matchDay2 + ":" + reversedTeams[l] + " " + list1.get(k) + "-" + list1.get(k + 1) + " Barcelona");
                                scoresList.add(list1.get(k));scoresList.add(list1.get(k+1));
                                l++;
                                k++;
                                matchDay2++;
                            }
                        }
                    }
                    return scoresList;

                default:
                    int matchDay3 = 1;
                    int counter = 0;
                   // int numberOfPlays = initializeThings.numberOfRounds();
                    for (int i = 0; i < (list1.size()-1) / 2; ) {
                        for (int j = 0; j < VecConst.teamArray.length; ) {
                            if (VecConst.teamArray[i].equals("Barcelona")) {
                                j++;
                                i++;
                            } else {

                                System.out.println("Round" + matchDay3 + ":" + " Barcelona " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
                                scoresList.add(list1.get(i));scoresList.add(list1.get(i+1));
                                i++;
                                j++;
                                matchDay3++;
                                counter++;
                                if (counter == z) {
                                    return scoresList;

                                }

                            }
                        }
                    }

                    list1.removeAll(list1);
                    String[] reversedTeams2 = implementMethods.reversedTeamsArray(VecConst.teamArray);
                    list1 = implementMethods.barcaVsRivalScores();
                    for (int k = 0; k < list1.size()-1/ 2; ) {
                        for (int l = 0; l < reversedTeams2.length; ) {
                            if (reversedTeams2[l].equals("Barcelona")) {
                                k++;
                                l++;

                            } else {

                                System.out.println("Round" + matchDay3 + ":" + reversedTeams2[l] + " " + list1.get(k) + "-" + list1.get(k + 1) + " Barcelona");
                                scoresList.add(list1.get(k)); scoresList.add(list1.get(k+1));
                                l++;
                                k++;
                                matchDay3++;
                                counter++;
                                if (counter == z) {
                                    return scoresList;
                                }
                            }
                        }
                    }
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
