public class Testclass {

    public static void reverse(int num) {
//develop1 code
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
