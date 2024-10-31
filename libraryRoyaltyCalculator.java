public class libraryRoyaltyCalculator {
    public static void main(String[] args) {
        author author = new author("Sussi Bech");


        author.addTitle(new printedBook("Tegneserie A", "TE", 140, 72));      // Tegneserie
        author.addTitle(new printedBook("Fagbog B", "FAG", 100, 200));        // Fagbog
        author.addTitle(new audioBook("Lydbog C", "SKØN", 10, 400));          // Skønlitterær lydbog


        double totalPay = author.calculateTotalPay();
        System.out.println(author.getName() + ": " + totalPay + "kr");
    }
}
