
public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        int x = 151;
        while (x > 0) {
            if (x % 2 == 1) {
                s.append("1");
            } else {
                s.append("0");
            }
            x = x / 2;

        }
        s.reverse();
        System.out.println(s);
    }
}
