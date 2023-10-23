public class FootballDataCalculator {
    int smallestDiffTeamNumber;

    public FootballDataCalculator() {
        this.smallestDiffTeamNumber = -1;
    }

    public static void main(String[] args){
        FootballDataCalculator calculator = new FootballDataCalculator();
        FootballFileReader fileReader = new FootballFileReader();
        System.out.println(fileReader.getTeamName(calculator.getTeamNumberFromSmallestGoalDiff()));
    }

    public int getGoalDiff(int teamNumber) {
        FootballFileReader fileReader = new FootballFileReader();
        int valueA = fileReader.getA(teamNumber);
        int valueF = fileReader.getF(teamNumber);
        if(valueA == -1 || valueF == -1) return 999999;
        return Math.abs(valueA - valueF);
    }

    public int getSmallestGoalDiff() {
        int smallestDiff = 999999;
        for(int teamNumber = 1; teamNumber <= 20; ++teamNumber){
            int teamGoalDiff = getGoalDiff(teamNumber);
            if(smallestDiff > teamGoalDiff) {
                smallestDiff = teamGoalDiff;
                this.smallestDiffTeamNumber = teamNumber;
            }
        }
        return smallestDiff;
    }

    public int getTeamNumberFromSmallestGoalDiff() {
        if(smallestDiffTeamNumber == -1) getSmallestGoalDiff();
        return this.smallestDiffTeamNumber;
    }
}
