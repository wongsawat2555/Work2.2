public class DiscountCalculator {
    public static Card getCardType(String cardType) {
        switch (cardType.toLowerCase()) {
            case "silver":
                return new SilverCard();
            case "gold":
                return new GoldCard();
            case "platinum":
                return new PlatinumCard();
            default:
                System.out.println("Invalid card type entered.");
                return null;
        }
    }
}