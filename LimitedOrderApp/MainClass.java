import java.util.*;

public class Main {

    public static void main(String[] args) {

        DiscountPolicy rateDiscountPolicy = new RateDiscountPolicy(10);
        DiscountPolicy fixDiscountPolicy = new FixDiscountPolicy(2000);

        List<Product> products = new ArrayList<>();

        products.add(new Product("운동화", 100000, 10, rateDiscountPolicy));
        products.add(new Product("티셔츠", 30000, 5, fixDiscountPolicy));

        System.out.println("===== 선착순 판매 시스템 가동 =====");
        for (Product product : products) {
            product.order();
            System.out.println("---------------------------");
        }
    }
}
