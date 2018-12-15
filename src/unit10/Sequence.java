package unit10;

/**
 * 代码作用：
 * 内部类对象，可以访问制造他的外围对象的所有成员；
 * 还拥有外围类的所有元素的访问权
 * <p>
 * 设计模式：迭代器模式
 */
interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    //构造器，传入size参数，确定私有Object[]items的数组大小
    public Sequence(int size) {
        items = new Object[size];
    }

    //给items添加Object对象；通过判断next是否在items长度内
    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    //--------------------------------------------------
    //实现Selector的内容
    private class SequenceSelector implements Selector {
        private int i = 0;

        //当items的长度=i的长度时，到达结尾；配合next的i++使用
        @Override
        public boolean end() {
            return i == items.length;
        }

        //返回i当前Object的对象
        @Override
        public Object current() {
            return items[i];
        }

        //i++；判定条件是i是否<items的长度
        @Override
        public void next() {
            if (i < items.length) i++;
        }
    }

    //留给其他方法使用上面SequenceSelector的接口
    public Selector selector() {
        return new SequenceSelector();
    }
    //--------------------------------------------------


    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));//和E_10_2进行对比，add的内容就是自己在外部的新类
        }

        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }
}


