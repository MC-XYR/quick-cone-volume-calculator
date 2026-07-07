//练手，好久没碰java了awa，用这个程序算一次就结束了。
//圆锥体积计算公式：r²π×h÷3，也就是半径的平方×圆周率×高÷3，公式中的3也可以写成1/3（三分之一）。
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lang = "";
        System.out.println("请选择语言 / Please select language: ZH or EN");
        if (scanner.hasNext()) {
            lang = scanner.next();
        }
        boolean isChinese = lang.equalsIgnoreCase("ZH");
        double r = 0.0;
        if (isChinese) {
            System.out.println("请输入圆锥底面半径：");
        } else {
            System.out.println("Please enter the base radius of the cone:");
        }
        if (scanner.hasNext()) {
            String r1 = scanner.next();
            r = Double.parseDouble(r1);
        }

        if (isChinese) {
            System.out.println("半径是" + r);
        } else {
            System.out.println("Radius is " + r);
        }
        double h = 0.0;
        if (isChinese) {
            System.out.println("请输入圆锥的高：");
        } else {
            System.out.println("Please enter the height of the cone:");
        }
        if (scanner.hasNext()) {
            String h1 = scanner.next();
            h = Double.parseDouble(h1);
        }

        if (isChinese) {
            System.out.println("高是：" + h);
        } else {
            System.out.println("Height is: " + h);
        }
        double p1 = r * r * h / 3.0;
        if (isChinese) {
            System.out.println("圆锥的体积是（保留π）：" + p1 + "π");
        } else {
            System.out.println("The volume of the cone is (keeping π): " + p1 + "π");
        }
        double p2 = r * r * 3.14 * h / 3.0;
        if (isChinese) {
            System.out.println("圆锥的体积是（π取3.14）：" + p2);
        } else {
            System.out.println("The volume of the cone is (π as 3.14): " + p2);
        }
        double p3 = r * r * 3.1415926535897932384626433 * h / 3.0;
        if (isChinese) {
            System.out.println("圆锥的体积是（π取小数点后25位）：" + p3);
        } else {
            System.out.println("The volume of the cone is (π to 25 decimal places): " + p3);
        }
        scanner.close();
    }
}