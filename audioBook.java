public class audioBook extends title {
    private int durationMinutes;

    public audioBook(String titleName, String literatureType, int copies, int durationMinutes) {
        super(titleName, literatureType, copies);
        this.durationMinutes = durationMinutes;
    }

    @Override
    protected double calculatePoints() {
        double pointsPerMinute = getLiteraturePoints();
        return (durationMinutes * 0.5) * pointsPerMinute * copies;
    }

    @Override
    protected double getLiteraturePoints() {
        switch (literatureType) {
            case "BI": return 1.5;
            case "TE": return 1.5;
            case "LYRIK": return 3;
            case "SKØN": return 0.85;
            case "FAG": return 0.5;
            default: return 0;
        }
    }
}
