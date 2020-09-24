package implementation;

import constant.VecConst;
import initialization.InitializeThings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ImplementMethods {

    private InitializeThings initializeThings;

    public String [] reversedTeamsArray(String []teamsArray){
        String [] secondLegTeams = new String[teamsArray.length];
        int dim = teamsArray.length;
        for(int i =0;i<teamsArray.length;i++){
            secondLegTeams[dim-1] = teamsArray[i];
            dim--;
        }
        return secondLegTeams;
    }

    public List<Integer> barcaVsRivalScores() {
        InitializeThings initializeThings = new InitializeThings();
        List<Integer> resultsBarca = new LinkedList<>();
        int barca;
        int rival;
        int[] scoreArray = initializeThings.arrayOfScores();
        for (String i : VecConst.teamArray) {
            barca = (int) Math.floor(Math.random() * scoreArray.length);
            rival = (int) Math.floor(Math.random() * scoreArray.length);
            resultsBarca.add(barca);
            resultsBarca.add(rival);
        }
        return resultsBarca;
    }

    public List<Integer> realVsRivalScores() {
        InitializeThings initializeThings = new InitializeThings();
        List<Integer> resultsReal = new LinkedList<>();
        int real;
        int rival1;
        int[] scoreArray = initializeThings.arrayOfScores();
        for (String i : VecConst.teamArray) {
            real = (int) Math.floor(Math.random() * scoreArray.length);
            rival1 = (int) Math.floor(Math.random() * scoreArray.length);
            resultsReal.add(real);
            resultsReal.add(rival1);

        }
        return resultsReal;

    }
}
