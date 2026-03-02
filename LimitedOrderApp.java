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
