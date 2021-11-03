package org.tyaa.demo.java.se.basics.functional.interfaces.inner;

public class Parent {
    private int field = 42;
    private static String stringField = "Hello Inner Classes!";
    public class Child {
        public int getParentField() {
            return field;
        }
    }
    public static class StaticChild {
        public static String getParentStringField() {
            return Parent.stringField;
        }
    }
}
