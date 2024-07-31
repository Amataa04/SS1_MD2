import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        // vnd -> yen
        System.out.println("Nhập tiền VND: ");
        Scanner sc = new Scanner(System.in);
        int vnd = sc.nextInt();
        final int yen = vnd / 160;
        System.out.println(yen+ " Yên");
    }
}
