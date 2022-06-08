
public class Test {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println(x);
        System.out.println(y);

    }

}
