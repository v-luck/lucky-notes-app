package WindowManager;

public class Test {
    private int test1;
    private int test2;

    public Test() {
        test1 = 0;
        test2 = test1 + 5;
    }

    public void changeTest1(int test) {
        test1 = test;
    }

    public int getTest1() {
        return test1;
    }
    public int getTest2() {
        return test2;
    }
}
