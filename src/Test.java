
public class Test {
    public static void main(String[] args) {
        TestClass ob = new TestClass(0);
        for(int i=0; i< 1000000; i++) {
            ob.generator(i);
        }
    }
}
