public class Testclass {

    public static void reverse(int num) {
//develop1 code

        System.out.println("change1");
        System.out.println("change2");
        if (num < 10) {
            System.out.println(num);
        } else {
            System.out.println(num % 10);
            reverse(num / 10);
        }
    }

    public static void main(String args[])
    {
        reverse(123);
    }
}
