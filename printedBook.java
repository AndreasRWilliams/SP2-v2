public class printedBook extends title {
    private int pages;

    public printedBook(String titleName, String literatureType, int copies, int pages) {
        super(titleName, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        double pointsPerPage = getLiteraturePoints();
        return pages * pointsPerPage * copies;
    }

    @Override
    protected double getLiteraturePoints() {
        switch (literatureType) {
            case "BI": return 3;
            case "TE": return 3;
            case "LYRIK": return 6;
            case "SKØN": return 1.7;
            case "FAG": return 1;
            default: return 0;
        }
    }
}
