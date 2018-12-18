package unit10;

/**
 * 是的Outter类包含一个private String域（由构造器初始化）
 * Inner包含一个显示这个域的toString()方法。
 * 创建一个Inner类型的对象并显示它。
 */
public class E10_2_LinkOuterStr {
    private String str;

    public E10_2_LinkOuterStr(String str) {
        this.str = str;
    }

    private class Inner {
        @Override
        public String toString() {
            return str;
        }
    }

    public Inner getInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(1);
        E10_2_LinkOuterStr str = new E10_2_LinkOuterStr("HelloWorld");
        Inner inner = str.getInner();
        sequence.add(inner);

        Selector selector = sequence.selector();

        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
