import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherDataCalculatorTest {
    @Test
    public void testDy1TempSpread(){
        WeatherDataCalculator weatherDataCalculator = new WeatherDataCalculator();
        assertEquals(29, weatherDataCalculator.calTempSprdDy(1));
    }
}
