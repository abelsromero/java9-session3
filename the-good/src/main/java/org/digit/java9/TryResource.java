package org.digit.java9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryResource {

    public static void main(String[] args) throws FileNotFoundException {

        // So far we were forced to init resources in the same clause
        try (FileInputStream fis = new FileInputStream("pom.xml")) {
            System.out.println("Is available? " + fis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Now we can do this
        FileInputStream fis = new FileInputStream("pom.xml");
        try (fis) {
            System.out.println("Is available? " + fis.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
