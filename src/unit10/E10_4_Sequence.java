package unit10;

/**
 * 在Sequence.SequenceSelector类中添加一个方法，它可以生成对外部类Sequence的引用；
 */
interface Selectore {
    boolean end();

    Object current();

    void next();
}

public class E10_4_Sequence {
    private Object[] items;
    private int next = 0;

    public void f() {
        System.out.println("fuck this");
    }

    public E10_4_Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    private class SeqSel implements Selectore {
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
            i++;
        }

        //在SeqSel中添加获取外部类Seq的引用；
        public E10_4_Sequence outer() {
            return E10_4_Sequence.this;
        }
    }

    public Selectore selectore() {
        return new SeqSel();
    }


    public static void main(String[] args) {
        E10_4_Sequence sequence = new E10_4_Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(Integer.toString(i));
        }

        E10_4_Sequence.SeqSel sss = sequence.new SeqSel();
        //sss.f();//无法使用外部类方法；
        while (!sss.end()) {
            System.out.print(sss.current() + " ");
            sss.next();
        }

        E10_4_Sequence.SeqSel sss1 = (SeqSel) sequence.selectore();
        sss1.outer().f();
    }
}
