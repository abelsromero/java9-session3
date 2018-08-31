package org.digit.modules.imports;

import org.digit.modules.provider.MyService;

import java.util.ServiceLoader;

public class ServiceProviderMain {

    public static void main(String[] args) {
        final ServiceLoader<MyService> services = ServiceLoader.load(MyService.class);

        services
            .findFirst()
            .ifPresentOrElse(
                s -> System.out.println(s.concat("Hello", "World")),
                () -> System.out.println("No provider found")
            );
    }
}
