public class Product {

    private String productName;
    private int productPrice;
    private int productQuantity;
    private DiscountPolicy discountPolicy;

    public Product(String productName, int productPrice, int productQuantity, DiscountPolicy discountPolicy) {
        this.productName = productName;
        this.productPrice = Math.max(productPrice, 0);
        this.productQuantity = productQuantity;
        this.discountPolicy = discountPolicy;
    }

    public void order() {
        int discount = discountPolicy.calculateDiscount(this.productPrice);
        int finalPrice = this.productPrice - discount;

        if (this.productQuantity > 0) {
            this.productQuantity--;
            System.out.println(this.productName + " 주문 성공! 현재 재고: " + this.productQuantity);
            System.out.println("최종 결제 금액: " + finalPrice);
        } else {
            System.out.println(this.productName + "이 품절 되었습니다.");
        }
    }
}
