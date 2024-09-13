public class GoldCard extends Card {
    public GoldCard() {
        super(0.03); // 3% discount
    }

    @Override
    public double calculateFinalAmount(double amount) {
        double effectiveDiscount = (amount >= 1000) ? getDiscount() : 0.0;
        return amount * (1 - effectiveDiscount);
    }
}