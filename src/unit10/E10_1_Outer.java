package unit10;

/**
 * Outer类，包含一个Inner内部类，和返回Inner对象的方法。
 * 在main()中创建并初始化一个指向Inner对象的引用。
 */
public class E10_1_Outer {
    class Inner {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        E10_1_Outer outer = new E10_1_Outer();

        System.out.println(outer.getInner().value());

        E10_1_Outer outer2 = new E10_1_Outer();

        E10_1_Outer.Inner i = outer2.getInner();

        System.out.println(i.value());

    }
}
