public class City {
    private String name;
    private long population;
    private double area;
    private String language;
    private String majorOfCity;
    private String[] disticts = {""};
    public City(String name,long population,double area ,String language,String majorOfCity,String[] disticts){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMajorOfCity() {
        return majorOfCity;
    }

    public void setMajorOfCity(String majorOfCity) {
        this.majorOfCity = majorOfCity;
    }

    public String[] getDisticts() {
        return disticts;
    }

    public void setDisticts(String[] disticts) {
        this.disticts = disticts;
    }
}
