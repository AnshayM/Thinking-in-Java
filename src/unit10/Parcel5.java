package unit10;

import unit10.InnerClassUpCase.Destination;

/**
 * 局部内部类
 * 在放的作用域内创建一个完整的类
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestination implements Destination {
            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }   //class PDestination在一个方法destination中；
        return new PDestination(s); //同时实现向上转型为Destination，返回的是Destination的引用；
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
