package implementation;

import constant.VecConst;
import initialization.InitializeThings;

import java.util.ArrayList;
import java.util.List;

public class SeasonStatsReal {

    private InitializeThings initializeThings;
    private ImplementMethods implementMethods;

    public SeasonStatsReal() {

    }

    public SeasonStatsReal(InitializeThings initializeThings, ImplementMethods implementMethods) {
        this.initializeThings = initializeThings;
        this.implementMethods = implementMethods;
    }

    public List<Integer> calculateResultsReal(int x, int z) {
        try {
            List<Integer> scoresList = new ArrayList<Integer>();
            ImplementMethods implementMethods = new ImplementMethods();
            InitializeThings initializeThings = new InitializeThings();
            List<Integer> list1 = implementMethods.realVsRivalScores();
            switch (x) {

                case 1:
                    int matchDay = 1;
                    for (int i = 0; i < (list1.size() - 1) / 2; ) {
                        for (int j = 0; j < VecConst.teamArray.length; ) {
                            if (VecConst.teamArray[i].equals("Real Madrid")) {
                                j++;
                                i++;
                            } else {

                                System.out.println("Round" + matchDay + ":" + " Real Madrid " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
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
                            if (VecConst.teamArray[i].equals("Real Madrid")) {
                                j++;
                                i++;
                            } else {
                                System.out.println("Round" + matchDay2 + ":" + " Real Madrid " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
                                scoresList.add(list1.get(i));
                                scoresList.add(list1.get(i + 1));
                                i++;
                                j++;
                                matchDay2++;

                            }
                        }
                    }
                    list1.removeAll(list1);
                    String[] reversedTeams = implementMethods.reversedTeamsArray(VecConst.teamArray);
                    list1 = implementMethods.realVsRivalScores();
                    for (int k = 0; k < (list1.size() - 1) / 2; ) {
                        for (int l = 0; l < reversedTeams.length; ) {
                            if (reversedTeams[l].equals("Real Madrid")) {
                                k++;
                                l++;

                            } else {
                                System.out.println("Round" + matchDay2 + ":" + reversedTeams[l] + " " + list1.get(k) + "-" + list1.get(k + 1) + " Real Madrid");
                                scoresList.add(list1.get(k));
                                scoresList.add(list1.get(k + 1));
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
                    for (int i = 0; i < (list1.size() - 1) / 2; ) {
                        for (int j = 0; j < VecConst.teamArray.length; ) {
                            if (VecConst.teamArray[i].equals("Real Madrid")) {
                                j++;
                                i++;
                            } else {
                                scoresList.add(list1.get(i));
                                scoresList.add(list1.get(i + 1));
                                System.out.println("Round" + matchDay3 + ":" + " Real Madrid " + list1.get(i) + "-" + list1.get(i + 1) + " " + VecConst.teamArray[i] + " ");
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
                    list1 = implementMethods.realVsRivalScores();
                    for (int k = 0; k < (list1.size() - 1) / 2; ) {
                        for (int l = 0; l < reversedTeams2.length; ) {
                            if (reversedTeams2[l].equals("Real Madrid")) {
                                k++;
                                l++;

                            } else {
                                scoresList.add(list1.get(k));
                                scoresList.add(list1.get(k + 1));
                                System.out.println("Round" + matchDay3 + ":" + reversedTeams2[l] + " " + list1.get(k) + "-" + list1.get(k + 1) + " Real Madrid");
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


