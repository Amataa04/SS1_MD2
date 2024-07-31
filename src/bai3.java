import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // chu vi va dien tich hinh vuong
        // C = canh * 4
        // S = canh * canh
        System.out.println("Nhập cạnh hình vuông: ");
        Scanner sc = new Scanner(System.in);

        float canh = sc.nextFloat();
        final float chuVi = canh * 4;
        final float dienTich = canh * canh;

        System.out.printf("chu vi hình vuông: %.2f",chuVi);
        System.out.printf("diện tích hình vuông: %.2f",dienTich);
    }
}
