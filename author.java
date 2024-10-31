import java.util.ArrayList;
import java.util.List;

public class author {
    private String name;
    private List<title> titles;

    public author(String name) {
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(title title) {
        titles.add(title);
    }

    public double calculateTotalPay() {
        double totalPay = 0;
        for (title title : titles) {
            totalPay += title.calculateRoyalties();
        }
        return Math.round(totalPay * 100.0) / 100.0; // Runder af til 2 decimaler
    }

    public String getName() {
        return name;
    }
}
