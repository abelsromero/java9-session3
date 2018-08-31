package org.digit.java9;

import java.util.Optional;

public class StackWalkerExamples {

    public static void main(String[] args) {

        final Optional<StackWalker.StackFrame> framesWithInterestingClass =
                StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE)
                        .walk((s) -> s
                                .filter(f -> f.getDeclaringClass().equals(StackWalkerExamples.class))
                                .findFirst()
                        );

        System.out.println("Class: " + framesWithInterestingClass.get().getClassName());
        System.out.println("Method: " + framesWithInterestingClass.get().getMethodName());
        System.out.println("Method: " + framesWithInterestingClass.get().getLineNumber());

        System.out.println("Frame with interseting class : \n" + framesWithInterestingClass.toString());
    }


}
