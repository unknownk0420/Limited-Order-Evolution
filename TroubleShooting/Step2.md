```java

public class Product {

    private String productName;
    private int productPrice;
    private int productQuantity;

    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = Math.max(productPrice, 0);
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

1. 구현 내용
객체지향 원칙을 반영한 설계:

데이터(필드)와 행위(메서드)를 하나의 단위로 묶어 Product 객체를 설계하고 캡슐화된 상태를 바탕으로 주문 로직(order)을 구현했습니다.

2. 발견된 문제점 (Trouble Shooting)
강한 결합으로 인한 확장성 저하:

현재 구조에서는 새로운 할인 정책이나 부가 기능을 추가할 때마다 Product 클래스의 내부 코드를 직접 수정해야 합니다. 이는 OCP원칙에 위배되며 요구사항이 늘어날수록 클래스가 비대해지고 유지보수가 어려워지는 원인이 됩니다.

기본 타입 멤버 변수의 한계:

할인율, 할인 금액 등 정책 관련 데이터를 기본 타입 변수로만 관리할 경우 새로운 정책이 추가될 때마다 유사한 변수를 계속 추가해야 합니다. 이는 코드 중복을 야기하고 객체의 응집도를 떨어뜨립니다.

3. 결론
객체 합성과 다형성의 필요성:

기능을 클래스 내부에 직접 구현하는 대신 해당 기능을 수행하는 객체를 외부에서 주입받는 객체 합성 방식의 필요성을 절감했습니다.

인터페이스를 활용한 다형성을 통해 Product 클래스의 코드 수정 없이도 새로운 기능을 유연하게 확장할 수 있는 구조로 리팩토링을 진행하기로 결정했습니다.
