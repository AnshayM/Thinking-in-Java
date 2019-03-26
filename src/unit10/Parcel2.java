package unit10;

public class Parcel2 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    //内部类
    class Destination {
        private String label;

        public Destination(String whereTo) {
            label = whereTo;
        }

        String readlabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    //外部类方法，方法内部是为了获取内部类的对象；区别于main()中的外部类对象，直接调用内部类对象；
    //这是两种不同的创建内部类对象的方法；
    //在class Parcel3中，使用.new,可以简化上面代码中创建内部类对象的过程；
    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readlabel());
    }

    public static void main(String[] args) {
        Parcel2 parcel2 = new Parcel2();
        parcel2.ship("Tasmania");
        Parcel2 q = new Parcel2();
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.to("Borneo");
    }
}
