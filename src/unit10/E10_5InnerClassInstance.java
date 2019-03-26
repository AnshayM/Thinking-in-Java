package unit10;

public class E10_5InnerClassInstance {
    public static void main(String[] args) {
        E10_5InnerClass ic = new E10_5InnerClass();
        E10_5InnerClass.PubInner pi = ic.new PubInner();//当然也可以使用获取静态的方法获取内部类的实例；
        pi.f();

        System.out.println(ic.getPriInner());//无法获取private内部类内部的方法；

    }
}
