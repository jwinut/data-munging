public class WeatherData {
    String[] lines;
    public WeatherData(String[] lines) {
        this.lines = lines;
    }

    public String getPDir(String dy) {
        int index = 1;
        try {
            index += Integer.parseInt(dy);
        } catch (Exception e) {
            index = -1;
        }
        return lines[index].substring(54, 58).trim();
    }
}
