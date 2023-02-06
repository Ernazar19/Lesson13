public class Shark {
    private String sharkName;
    private String breeds ;
    private int weight;
    private int length;

    public Shark(String sharkName, String breeds, int weight, int length) {
        this.sharkName = sharkName;
        this.breeds = breeds;
        this.weight = weight;
        this.length = length;
    }

    public String getSharkName() {
        return sharkName;
    }

    public void setSharkName(String sharkName) {
        this.sharkName = sharkName;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
