package org.tyaa.demo.java.se.basics.functional.interfaces.custom.functional.interfaces;

@FunctionalInterface
public interface IMyComparator<T> {
    int compare(T value1, T value2);
    // boolean myMethod(T value);
}
