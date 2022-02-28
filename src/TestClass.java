public class TestClass {

    public TestClass(int x) {
        System.out.println("START CONSTRUCTOR");
    }

    public void meth(){
        System.out.println("METHOD");
    }

    protected void finalize() {
        System.out.println("FINALIZE");
    }
}
