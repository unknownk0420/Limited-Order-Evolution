public class Product {

    private String productName;
    private int productPrice;
    private int productQuantity;

    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = Math.max(productPrice, 0);//private와 Math.max를 활용하여 외부의 잘못된 조작으로부터 데이터를 보호
        this.productQuantity = productQuantity;
    }

    public void order() {
        if (this.productQuantity > 0) {
            this.productQuantity--;
            System.out.println(this.productName + "주문 성공! 현재 재고: " + this.productQuantity);
        } else {
            System.out.println(this.productName + "이 품절 되었습니다.");
        }
    }
}
