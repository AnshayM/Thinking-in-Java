package unit10;

/**
 * 创建一个至少含有一个方法的接口。在某个方法内定义一个内部类以实现该接口，这个方法返回对此接口的引用；
 */

interface ClassInMe {
    void f();
}

public class E10_9_ClassInMethod {

    public ClassInMe test() {
        class InnerClass implements ClassInMe {

            @Override
            public void f() {
                System.out.println("fuck this");
            }
        }
        return new InnerClass();
    }

    public static void main(String[] args) {
        E10_9_ClassInMethod method=new E10_9_ClassInMethod();
        method.test().f();
    }
}
