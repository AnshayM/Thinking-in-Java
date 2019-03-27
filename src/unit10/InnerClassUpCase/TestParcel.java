package unit10.InnerClassUpCase;

/**
 * 内部类向上转型：
 * 内部类向上转型为基类，尤其是转型为一个接口时，可以很好的隐藏实现细节；
 */
class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String lable;

        private PDestination(String whereTo) {
            lable = whereTo;
        }

        @Override
        public String readLabel() {
            return lable;
        }
    }

    //公开的都是接口，内部类的实现，完全隐藏；
    public Destination destination(String s) {
        return new PDestination(s);//向上转型
    }

    public Contents contents() {
        return new PContents();//向上转型
    }
}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}