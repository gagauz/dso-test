package dso.test;

import javassist.CannotCompileException;
import javassist.NotFoundException;

import java.io.IOException;

public class TestApp {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        TestServiceWithRoot testService = new TestServiceWithRoot();
        System.out.println(testService.toString());
        System.out.println(testService.getRoot());

    }
}
