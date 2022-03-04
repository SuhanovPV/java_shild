public class TestClass {
    int x;
    public TestClass(int x) {
        this.x = x;
    }

    public void meth(){
        System.out.println("METHOD");
    }

    protected void finalize() {
        System.out.println("FINALIZE: " + x);
    }

    void generator(int i) {
        TestClass o = new TestClass(i);
    }
}
