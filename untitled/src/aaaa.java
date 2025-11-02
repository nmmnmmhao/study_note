import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {
        double width;
        double height;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入矩形的宽: ");
        width = scanner.nextDouble();

        System.out.print("请输入矩形的高: ");
        height = scanner.nextDouble();

        area = width * height;

        System.out.println("矩形的宽是: " + width);
        System.out.println("矩形的高是: " + height);
        System.out.println("矩形的面积是: " + area);

        scanner.close();
    }
}    