package org.digit.java9;

public interface DefaultInterfaceMethods {

    Integer counter(String value);

    default int countAs(String value) {
        return count('a',value);
    }

    static int countBs(Character character, String value) {
        return count('B',value);
    }

    private static int count(Character character, String value) {
        int count = 0;
        for (int i = 0; i < value.length(); i++) {
            if (character.equals(value.charAt(i))) {
                count++;
            }
        }
        return count;
    }

}
