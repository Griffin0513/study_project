// 导包，要在类定义上面导入
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 创建对象，类的实例化
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入：");

        // 接收数据
        int i = sc.nextInt();

        System.out.println("输入的值为：" + i);
    }
}