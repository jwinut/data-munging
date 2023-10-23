import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballFileReaderTest {
    @Test
    public void testReadFootballFile(){
        FootballFileReader fileReader = new FootballFileReader();
        assertEquals(79, fileReader.getF(1));
        assertEquals(36, fileReader.getA(1));
    }
}
