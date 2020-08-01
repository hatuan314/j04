package hatuan314.com.vn.Buoi1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Printf("");
        // Xuất ra màn hình
        System.out.println("Hello world");
        /*
        Ngôn ngữ C
        int a;
        Scanf("%d", &a);
         */
        System.out.println("Nhap: ");

        String name;
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();

        /*
        C
        Printf("Name: %s", name);
         */
        System.out.println("Name: " + name);

        /*
        int: Số nguyên
        float: Số thực
        double: Số thức
        char: Ký tự
        String: Chuỗi
        Boolean: true/false
        Byte
         */
        int a = 4;
        int b = 6;
        if (a < b) {
            System.out.println("a nhỏ hơn b");
        } else if (a == b) {
            System.out.println("a bằng b");
        } else {
            System.out.println("a lớn hơn b");
        }
    }
}

/*
C
- Thư viện
- Hàm main
 */

/*
JAVA
- package
- Thư viện
- Lớp - class
- hàm main
 */

