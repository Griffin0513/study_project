public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World.");
        System.out.print("Hello World.");
        // 占位符%s表示参数是字符串
        System.out.printf("Hi, %s!", "Tony");

        int i = 123;
        // 占位符%d表示参数是整数
        System.out.printf("%d", i);

        double d = 123.456;
        // 占位符%f表示格式化浮点数
        // %n输出换行符 == \n
        System.out.printf("%f%n", d);
        // 5表示输出总长度，2表示保留小数位数
        System.out.printf("%5.2f", d);

    }
}
