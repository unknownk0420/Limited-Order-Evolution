```java
int productQuantity = Integer.parseInt(st.nextToken());
order(productQuantity);

private static void order(int productQuantity) {
        if (productQuantity > 0) {
            productQuantity--;
        } else {
            System.out.println("품절");
        }
}

1. 구현 내용

main 메서드에서 상품 데이터를 변수로 관리하고 외부 함수(order)를 통해 재고를 차감하는 전형적인 절차지향 로직 구현.

2. 발견된 문제점 (Trouble Shooting)

Call by Value: 자바의 기본 자료형(int)은 메서드 호출 시 값이 복사되어 전달됩니다.

order(productQuantity)를 호출하여 내부에서 -- 연산을 수행해도 main에 있는 원본 재고 변수에는 아무런 영향이 없습니다.

캡슐화 부재:

데이터(재고)와 행위(주문)가 분리되어 있어 재고라는 중요한 데이터가 로직 이곳저곳에 노출되어 오염될 위험이 큽니다.

확장성 저하:

상품 종류가 늘어나거나 환불, 입고 등의 기능이 추가될 경우 Main 클래스가 거대해 질 것으로 예상됩니다.

3. 결론

단순 변수와 함수만으로는 실제 비즈니스 로직의 상태를 안전하게 유지하기 어렵다는 것을 확인했습니다. 이를 해결하기 위해 데이터와 행위를 하나로 묶는 클래스 도입이 필요함을 절감했습니다.
