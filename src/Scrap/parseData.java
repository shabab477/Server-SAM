package Scrap;

public class parseData {

    private String name;
    private int year;
    private String quality;
    private boolean validData = false;

    parseData(String _fullTitle) {
        if (_fullTitle.contains("(") && _fullTitle.contains(")")) {
            String[] splited = _fullTitle.split("[\\(\\)]");
            name = splited[0].trim();
            year = Integer.parseInt(splited[1].trim());
            quality = splited[2].trim();
            validData = true;
        } else {
            name = "Error !";
            validData = false;
        }

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getQuality() {
        return quality;
    }

    public boolean getDataValidity() {
        return validData;
    }
}
