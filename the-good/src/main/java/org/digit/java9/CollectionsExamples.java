package org.digit.java9;

import java.util.*;

public class CollectionsExamples {

    public static void main(String[] args) {

        final List<String> values = Arrays.asList("uno", "dos", "tres");
        // warning: is immutable and next line will fail if uncommented
//        values.add("cuatro");
        printInstance(values);

        final List<String> oneValue = List.of("uno");
        printInstance(oneValue);

        final List<String> twoValues = List.of("uno", "dos");
        printInstance(twoValues);

        final List<String> manyValues = List.of("uno", "dos", "tres");
        printInstance(manyValues);

        Map<String, Integer> singleValueMap = Map.of("k1", 1);
        printInstance(singleValueMap);

        Map<String, Integer> map = Map.of("k1", 1, "k2", 3);
        printInstance(map);


        // WARNING: it does not allow duplicated values on initialization
        final Set<String> oneSet = Set.of("uno", "dos", "tres");
        printInstance(oneSet);

        Set<String> oldSet = new HashSet<>();
        oldSet.add("uno");
        oldSet.add("uno");
        oldSet.add("dos");
        oldSet.add("tres");
        oldSet = Collections.unmodifiableSet(oldSet);
        printInstance(oldSet);
    }

    private static void printInstance(Object manyValuest) {
        System.out.println(manyValuest.getClass() + ": " + manyValuest);
    }

}
