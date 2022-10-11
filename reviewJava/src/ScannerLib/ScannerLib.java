package ScannerLib;


import java.util.Scanner;
public class ScannerLib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float diem;
        String hoVaTen;

        System.out.print("Nhập họ và tên: ");
        hoVaTen = scanner.nextLine();
        System.out.print("Nhập điểm: ");
        diem = scanner.nextFloat();

        System.out.println(hoVaTen + " " + diem + " điểm!");
    }
}
