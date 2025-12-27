public class OverloadGreet {
    public static void main(String[] args) {
        System.out.println("main method start");
        test(1);
        System.out.println("Main method ends");
    }

    public static void test(int n) {
        System.out.println("Hello test method");
    if (n <= 3) {
        System.out.println("hi batch m3");
        test(++n);
    }
    System.out.println("Bye test method");
}
}
