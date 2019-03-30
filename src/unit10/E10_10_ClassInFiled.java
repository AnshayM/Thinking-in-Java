package unit10;

/**
 * 重复前一个练习，但将内部类定义在某个方法的一个作用域内。
 *
 *
 */
interface ClassInMe2 {
    void f();
}

public class E10_10_ClassInFiled {
    private void test(boolean b) {
        if (b) {
            class InnerClass2 implements ClassInMe2 {

                @Override
                public void f() {
                    System.out.println("Fuck this");
                }
            }
            InnerClass2 i=new InnerClass2();
            i.f();//对比上一个程序，这个程序将代码隐藏的更深，无法直接获取；只能在private的test()中调用f();
        }

    }

    public void getString() {
        test(true);
    }

    public static void main(String[] args) {
        E10_10_ClassInFiled x=new E10_10_ClassInFiled();
        x.getString();
        x.test(true);//与上一行相同的作用，区别在于这个耦合度更高；
    }
}
