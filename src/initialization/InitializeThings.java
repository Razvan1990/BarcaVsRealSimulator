package initialization;

import java.util.Scanner;

public class InitializeThings {

    public int numberOfRounds() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number of required rounds for points simulation");
        int a = scanner.nextInt();

        if (a > 38) {
            throw new Exception("Season has a max of 38 rounds.Please review your input");
        }
        return a;
    }

    public int halfSeasonAllSeasonUserInputRounds() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        if (b > 3) {
            throw new Exception("Cannot appeal function for simulating season");
        }
        return b;
    }

    public int[] arrayOfScores() {
        int[] myArray = new int[6];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }

    public int userOption() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        return x;
    }


}

