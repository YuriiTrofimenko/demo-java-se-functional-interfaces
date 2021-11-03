package org.tyaa.demo.java.se.basics.functional.interfaces;

import org.tyaa.demo.java.se.basics.functional.interfaces.impl.IntComparator;
import org.tyaa.demo.java.se.basics.functional.interfaces.impl.Person;
import org.tyaa.demo.java.se.basics.functional.interfaces.inner.Parent;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        var array = new Integer[]{1, 3, -5, 10, 0, 1};
        // Arrays.sort(array);

        // 1 - Class
        /* var intComp = new IntComparator();
        Arrays.sort(array, intComp::compare); */

        // 2 - Anonymous Class
        /* Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        }); */

        // 3 - Lambda Expression
        /* Arrays.sort(array, (a, b) -> a - b);

        for (int item : array) {
            System.out.println(item);
        } */

        /* Parent.Child child1 = new Parent().new Child();
        System.out.println(child1.getParentField());

        System.out.println(Parent.StaticChild.getParentStringField()); */

        Person p1 = new Person("John", 30);
        Person p2 = new Person("Bill", 66);
        System.out.println(p1.compareTo(p2));

        var people = new Person[]{p1, p2};
        Arrays.sort(people, (pers1, pers2) -> pers2.compareTo(pers1));
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
