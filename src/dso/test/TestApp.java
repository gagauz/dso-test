package dso.test;

import javassist.CannotCompileException;
import javassist.NotFoundException;

import java.io.IOException;

public class TestApp {
    public static void main(String[] args) throws NotFoundException, CannotCompileException, IOException, NoSuchFieldException, SecurityException,
            IllegalArgumentException, IllegalAccessException {
        BigData bigData = new BigData();
        System.out.println(bigData);
    }
}
