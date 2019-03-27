package unit10;

/**
 * 创建一个含有private域和private方法的类；
 * 创建一个内部类，它有一个方法可以用来修改外围类的域，并调用外围类的方法。
 * 在外围类的另一个方法中，创建此内部类的对象，
 * 并且调用它的方法，然后说明对外围类对象的影响。
 * <p>
 * 同时，确定外部类是否可以方位内部类的private元素；（证明是可以的，不过，首先需要获得内部类对象，在内部类对象的基础上操作）
 */
public class E10_7_InnerClass {
    private String str = "ohhou";

    private void f() {
        System.out.println("fuck this");
    }

    class Inner {
        private String strInner = "oh hou ";
        public String strInner1 = "oh hou 1";

        public void modifyOuterFiled() {
            str = str + "?";
            f();//此处理解方法调用要在方法内部；内部类可以使用外部类方法；
        }
    }

    public void newInner() {
        Inner inner = new Inner();
        inner.modifyOuterFiled();
        inner.strInner = inner.strInner + " hahahahha";
        inner.strInner1 = inner.strInner1 + "hahahahha";
        System.out.println(inner.strInner + "\n" + inner.strInner1);
    }

    public static void main(String[] args) {
        E10_7_InnerClass innerClass = new E10_7_InnerClass();
        innerClass.newInner();
        System.out.println(innerClass.str);
    }
}
