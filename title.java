// Title.java
abstract class title {
    protected String titleName;
    protected String literatureType;
    protected int copies;
    protected static final double RATE = 0.067574; // Aktuel rate i 2024

    public title(String titleName, String literatureType, int copies) {
        this.titleName = titleName;
        this.literatureType = literatureType;
        this.copies = copies;
    }


    public double calculateRoyalties() {
        return calculatePoints() * RATE;
    }
    protected abstract double calculatePoints();
    protected abstract double getLiteraturePoints();
}
