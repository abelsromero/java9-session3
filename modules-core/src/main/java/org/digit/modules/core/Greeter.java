package org.digit.modules.core;

import org.digit.modules.internal.StringUtils;

public class Greeter {

    private StringUtils utils = new StringUtils();

    public String sayHello(String message) {
        final String response = utils.format("Hello %s!", message);
        System.out.println(response);
        return response;
    }

}
