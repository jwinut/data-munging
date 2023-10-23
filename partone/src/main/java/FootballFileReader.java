import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FootballFileReader {
    String[] lines;

    public FootballFileReader() {
        lines = readFootballFile();
    }

    private String[] readFootballFile() {
        String[] readLines;
        try {
            readLines = Files.readAllLines(new File("/Users/nut/codekata/04-data-munging/football.dat").toPath()).toArray(new String[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return readLines;
    }

    public int getF(int teamNumber) {
        try{
            return Integer.parseInt(lines[teamNumber].substring(43, 45).trim());
        } catch (Exception e){
            return -1;
        }
    }

    public int getA(int teamNumber) {
        try{
            return Integer.parseInt(lines[teamNumber].substring(50, 52).trim());
        } catch (Exception e){
            return -1;
        }
    }

    public String getTeamName(int teamNumber) {
        return lines[teamNumber].substring(7, 23).trim();
    }
}
