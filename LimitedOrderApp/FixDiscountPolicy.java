public class FixDiscountPolicy implements DiscountPolicy {

    private int discountAmount;

    public FixDiscountPolicy(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int calculateDiscount(int price) {
        return Math.min(price, this.discountAmount);//고정 할인액이 상품의 가격보다 클 경우 할인액이 아닌 마이너스 가격이 계산되는 논리적 결함을 방지
    }

}
