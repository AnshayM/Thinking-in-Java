package unit10.E10_6_Test.pack2;

import unit10.E10_6_Test.pack1.Pack1Interface;

public class Pack2Class {
    protected class ImpPack1Interface implements Pack1Interface {
        private String str = "fucking this";

        @Override
        public String read() {
            return str;
        }
    }
}
