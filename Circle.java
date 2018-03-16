import java.util.Scanner;

public class Circle {
    public static void main(String[] args){
        final double PI = 3.14;

        Scanner scanner = new Scanner(System.in);

        float radius;
        System.out.println("Nhap gia tri ban kinh: ");
        radius = scanner.nextFloat();

        double area = (double)radius*radius*PI;
        double perimeter = (double)radius*2*PI;

        System.out.println("Chu vi hinh tron la: "+perimeter);
        System.out.println("Dien tich hinh tron la:"+area);
    }
}