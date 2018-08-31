package org.digit.modules.imports;

import org.digit.modules.core.StringFormatter;
import org.digit.modules.core.StringFormatterFactory;

import java.lang.reflect.InvocationTargetException;

public class StringFormatterMain {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {

        final StringFormatter formatter = StringFormatterFactory.stringFormatter();
        System.out.println(formatter.format("Hello %s!", "World"));
        System.out.println("Internal class is: " + formatter.getClass().getName());

        // need to `open` the module to access the methods using reflection
        (formatter.getClass().getConstructors()[0]).newInstance((Object[]) null);
    }

}
