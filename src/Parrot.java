public class Parrot {
    private String viev;
    private String parrotName;
    private String breeds;
    private int weight;
    private int length;

    public Parrot(String viev, String parrotName, String breeds, int weight, int length) {
        this.viev = viev;
        this.parrotName = parrotName;
        this.breeds = breeds;
        this.weight = weight;
        this.length = length;
    }

    public String getViev() {
        return viev;
    }

    public void setViev(String viev) {
        this.viev = viev;
    }

    public String getParrotName() {
        return parrotName;
    }

    public void setParrotName(String parrotName) {
        this.parrotName = parrotName;
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
