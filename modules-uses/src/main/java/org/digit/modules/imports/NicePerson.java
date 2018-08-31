package org.digit.modules.imports;

import org.digit.modules.core.Greeter;

public class NicePerson {

    final String name;

    public NicePerson(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sees(NicePerson nicePerson) {
        final Greeter greeter = new Greeter();
        greeter.sayHello(nicePerson.getName());
        // add the `exports` into the core module-info to use this class
//         StringUtils utils = new StringUtils();/
    }

    public static void main(String[] args) {
        final NicePerson person = new NicePerson("Bob");
        person.sees(new NicePerson("Alice"));
    }

}
