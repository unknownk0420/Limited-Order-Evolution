```java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String productName = st.nextToken();
        int productPrice = Integer.parseInt(st.nextToken());
        int productQuantity = Integer.parseInt(st.nextToken());

        Product product = new Product(productName, productPrice, productQuantity);

        product.order();

    }
}

1. 구현 내용

BufferedReader와 StringTokenizer를 활용해 동적인 사용자 입력을 처리하고 이를 바탕으로 Product 객체를 생성하여 재고 차감 기능을 수행하도록 구현했습니다. 

2. 발견된 문제점 (Trouble Shooting)

데이터 입력 방식의 비효율성:

매번 사용자가 모든 정보를 수동으로 입력해야 하는 방식은 대규모 시스템에서 사용자 편의성을 저해하며 데이터 입력의 무결성(실수 방지)을 보장하기 어렵습니다.

고정 배열 및 단일 객체 관리의 한계:

수많은 상품 데이터를 개별 변수나 고정 크기의 배열로 관리할 경우 데이터의 추가/삭제가 빈번한 이커머스 환경에서 유연한 대응이 불가능합니다.

3. 결론

고정된 크기의 배열 대신 데이터의 증감에 유연하게 대응할 수 있는 ArrayList와 같은 컬렉션 프레임워크 도입의 필요성을 인지했습니다.
실무적인 환경을 고려하여 매번 입력을 받는 대신 미리 정의된 상품 목록(초기 데이터)을 리스트화하여 관리하는 구조로 개선이 필요함을 깨달았습니다.
