package unit10;

/**
 * 代码作用：
 * 创建一个类，持有一个String,
 * 并且有一个显示这个String的toString()方法
 * 将新类的若干个对象添加到一个Sequence对象中，然后显示他们
 */

class MyHold {
    private String s;

    public MyHold(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s.toString();
    }
}

public class E10_2_LinkOuter2 {

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(new MyClass(i + ""));
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}

