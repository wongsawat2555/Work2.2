public abstract class Card {
    protected double discount;

    public Card(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public abstract double calculateFinalAmount(double amount);
}