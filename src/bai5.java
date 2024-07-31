import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        // chu vi hinh tron: 2 * pi * r
        // dien tich hinh tron: pi * r * r
        System.out.println("Nhập bán kính: ");
        Scanner sc = new Scanner(System.in);

        float banKinh = sc.nextFloat();
        final float PI = 3.14f;
        final float chuVi = PI * banKinh * 2;
        final float dienTich = PI * banKinh * banKinh;

        System.out.printf("chu vi hình tròn: %.2f\n", chuVi);
        System.out.printf("diện tích hình tròn: %.2f", dienTich);
    }
}
