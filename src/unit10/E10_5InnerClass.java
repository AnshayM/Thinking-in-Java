package unit10;

public class E10_5InnerClass {
    private class PriInner {
        public void f() {
            System.out.println("fuck this");
        }
    }

    public class PubInner {
        public void f() {
            System.out.println("fuck this");
        }
    }


    public PriInner getPriInner() {
        return new PriInner();
    }
}
