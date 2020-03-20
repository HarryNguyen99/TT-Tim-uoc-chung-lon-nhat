import java.util.Scanner;

public class TimUocChungLonNhat {
    public static void main(String[] args) {
        int a, b;
        Scanner nhap = new Scanner(System.in);
        System.out.print("Nhập a: ");
        a = nhap.nextInt();
        System.out.print("Nhập b: ");
        b = nhap.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0)
            System.out.println("Không có ước chung lớn nhất");

        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Ước chung lớn nhất: " + a);
    }
}
