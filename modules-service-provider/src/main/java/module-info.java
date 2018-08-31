module org.digit.provider {
    exports org.digit.modules.provider;

    provides org.digit.modules.provider.MyService with org.digit.modules.impl.MyServiceImpl;
}
