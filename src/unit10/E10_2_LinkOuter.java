package unit10;

/**
 * 代码作用：
 * 创建一个类，持有一个String,
 * 并且有一个显示这个String的toString()方法
 * 将新类的若干个对象添加到一个Sequence对象中，然后显示他们
 */

interface Selector2 {
    boolean end();

    Object current();

    void next();
}

class MyClass {
    private String s;

    public MyClass(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.toString();
    }
}

public class E10_2_LinkOuter {
    private Object[] items;
    private int next = 0;

    public E10_2_LinkOuter(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length)
            items[next++] = x;
    }

    public class E10_2_LinkOuterSelector implements Selector2 {
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length)
                i++;
        }
    }

    public Selector2 selector() {
        return new E10_2_LinkOuterSelector();
    }

    public static void main(String[] args) {
        E10_2_LinkOuter linkOuter = new E10_2_LinkOuter(10);
        for (int i = 0; i < 10; i++) {
            linkOuter.add(new MyClass(i + ""));
        }

        Selector2 selector2 = linkOuter.selector();
        while (!selector2.end()) {
            System.out.println(selector2.current() + " ");
            selector2.next();
        }
    }

}

