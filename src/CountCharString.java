import java.util.Scanner;

/*
* Đếm số lần xuất hiện của kí tự trong chuỗi
* */
public class CountCharString {

    public static void main(String[] args) {
        String document = "Xin chào các bạn mình là nguyễn thanh khiên" +
                "Học viên codegym khóa c01020k1" +
                "Rất vui được làm quen với các bạn";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 ký tự cần tìm: ");
        char s = scanner.nextLine().charAt(0);
        int count = 0;
        char str;
        for (int i = 0; i < document.length(); i++) {
            str = document.charAt(i);
            if (str == s) count++;


        }
        System.out.println("Kí tự bạn nhập vào có "+count+" ký tự trong chuỗi của chúng tôi!");

    }
}
