package unit10;

/**
 * 创建一个private内部类，让它实现一个public接口。
 * 写一个方法，它返回一个指向此private内部类的实例的引用，并将此引用向上转型为接口类型。
 * 通过尝试向下转型，说明此内部类已经被完全隐藏。
 */
interface ClassInMe3 {
    void f();
}

public class E10_11_PrivateInnerClass {
    private class PInnerClass implements ClassInMe3 {

        @Override
        public void f() {
            System.out.println("fuck this");
        }
    }

    public ClassInMe3 classInMe3() {
        return new PInnerClass();
    }

    public static void main(String[] args) {
        E10_11_PrivateInnerClass i=new E10_11_PrivateInnerClass();
        i.classInMe3().f();
        ClassInMe3 classInMe3 = i.classInMe3();
        //(PInnerClass)classInMe3.f();//编译不通过；
    }
}
