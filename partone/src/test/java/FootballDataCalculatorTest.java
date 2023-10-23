import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballDataCalculatorTest {
    @Test
    public void testValueForGoalDiffTeam1andTeam2(){
        FootballDataCalculator calculator = new FootballDataCalculator();
        assertEquals(43, calculator.getGoalDiff(1));
        assertEquals(37, calculator.getGoalDiff(2));
    }

    @Test
    public void testValueShouldReturn999999ForErrorGoalDiff(){
        FootballDataCalculator calculator = new FootballDataCalculator();
        assertEquals(999999, calculator.getGoalDiff(18));
    }

    @Test
    public void testTeamNameFromTeamNumber(){
        FootballFileReader fileReader = new FootballFileReader();
        assertEquals("Arsenal", fileReader.getTeamName(1));
    }

    @Test
    public void testFindSmallestGoalDiff(){
        FootballDataCalculator calculator = new FootballDataCalculator();
        assertEquals(1, calculator.getSmallestGoalDiff());
    }

    @Test
    public void testFindTeamNumberForSmallestGoalDiff(){
        FootballDataCalculator calculator = new FootballDataCalculator();
        assertEquals(8, calculator.getTeamNumberFromSmallestGoalDiff());
    }

}
