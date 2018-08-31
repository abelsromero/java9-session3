package org.digit.modules.impl;

import org.digit.modules.provider.MyService;

public class MyServiceImpl implements MyService {

    @Override
    public String concat(String msg1, String msg2) {
        return msg1 + " " + msg2;
    }

}
