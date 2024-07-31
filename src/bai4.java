import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        // tong trung binh (toan + van + anh) / 3
        System.out.println("Nhập điểm toán: ");
        System.out.println("Nhập điểm văn: ");
        System.out.println("Nhập điểm anh: ");
        Scanner sc = new Scanner(System.in);

        float toan = sc.nextFloat();
        float van = sc.nextFloat();
        float anh = sc.nextFloat();

        final float avg = (toan + van + anh) / 3;

        System.out.printf("Tổng trung bình các môn là: %.2f",avg);
    }
}
