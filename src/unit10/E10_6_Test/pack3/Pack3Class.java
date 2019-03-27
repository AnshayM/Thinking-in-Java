package unit10.E10_6_Test.pack3;

import unit10.E10_6_Test.pack2.Pack2Class;

/**
 * 继承Pack2中的类，并在一个方法中返回该Protected内部类的对象，
 * 在返回的时候向上转型为第一个包中的接口的类型；
 */
public class Pack3Class extends Pack2Class {
    public ImpPack1Interface f(){
//        return new ImpPack1Interface();//无法实现转型；因为ImpPack1Interface()是protected保护的；
        return null;
    }
    public static void main(String[] args) {

    }
}
