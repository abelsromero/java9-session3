package org.digit.java9;

import java.util.stream.Stream;

public class StreamExtensions {

    public static void main(String[] args) {

        System.out.println("Print strings up to length == 9");
        System.out.println("Print from 0 to 9");


        Stream.iterate(0, i -> i < 10, i -> i + 1)
            .forEach(System.out::println);

        Stream.iterate("", s -> s + "s")
            .takeWhile(s -> s.length() < 10)
            .forEach(System.out::println);

        Stream.iterate("", s -> s.length() < 12, s -> s + "s")
            .dropWhile(s -> s.length() < 10)
            .forEach(System.out::println);

        System.out.println("Print strings with length between 9 and 12 (non inclusive)");
    }
}
