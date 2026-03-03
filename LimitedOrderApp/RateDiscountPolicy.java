public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent;

    public RateDiscountPolicy (int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public int calculateDiscount(int price) {
        return price * this.discountPercent / 100;
    }

}
