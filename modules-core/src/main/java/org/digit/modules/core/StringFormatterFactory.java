package org.digit.modules.core;

import org.digit.modules.internal.StringUtils;

public class StringFormatterFactory {

    public static StringFormatter stringFormatter() {
        return new StringUtils();
    }
}
