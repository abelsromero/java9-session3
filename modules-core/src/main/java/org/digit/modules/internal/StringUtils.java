package org.digit.modules.internal;

import org.digit.modules.core.StringFormatter;

public class StringUtils implements StringFormatter {

    public String format (String format, String... args) {
        return String.format(format, args);
    }
}
