package unit10;

/**
 * 使用.this
 * 内部类生成对外部类对象的引用，可以直接使用外部类的名字.this
 */
public class DotThis {
    void f() {
        System.out.println("DotThis f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;//内部类使用外部类对象的引用，使用外部类的名字.this
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();

        //dt.inner()返回DotThis的对象
        DotThis.Inner dti = dt.inner();//无法直接new Inner()，除非使用Static；在原文P193中也对这个想法进行了说明
        dti.outer().f();//外部类使用内部类对象，内部类对象使用外部类的方法

        DotThis.Inner dti1 = dt.new Inner();//结合.new使用；相当于代替了inner()方法返回Inner对象
        dti1.outer().f();
    }
}
