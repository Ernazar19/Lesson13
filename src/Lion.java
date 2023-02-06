public class Lion {
    private String lionName;
    private String famillies;
    private String genus;
    private int weight;
    private int length;

    public Lion(String lionName, String famillies, String genus, int weight, int length) {
        this.lionName = lionName;
        this.famillies = famillies;
        this.genus = genus;
        this.weight = weight;
        this.length = length;
    }

    public String getLionName() {
        return lionName;
    }

    public void setLionName(String lionName) {
        this.lionName = lionName;
    }

    public String getFamillies() {
        return famillies;
    }

    public void setFamillies(String famillies) {
        this.famillies = famillies;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public int getWeight() {
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
