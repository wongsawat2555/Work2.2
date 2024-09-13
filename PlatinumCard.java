public class PlatinumCard extends Card {
    public PlatinumCard() {
        super(0.05); // 5% discount
    }

    @Override
    public double calculateFinalAmount(double amount) {
        return amount * (1 - getDiscount());
    }
}