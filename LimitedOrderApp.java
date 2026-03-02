import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int productName = Integer.parseInt(st.nextToken());
        int productPrice = Integer.parseInt(st.nextToken());
        int productQuantity = Integer.parseInt(st.nextToken());

        order(productQuantity);

    }

    private static void order(int productQuantity) {
        if (productQuantity > 0) {
            productQuantity--;
        } else {
            System.out.println("품절");
        }
    }
}
