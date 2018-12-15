package unit10;

public class Parcel1 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }


    class Destination {
        private String label;

        public Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);//与使用普通类没有区别；内部类的名字是嵌套在Parcel1中的
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }

}
