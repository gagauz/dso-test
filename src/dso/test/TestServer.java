package dso.test;

import dso.DSO;

public class TestServer {

    public static void main(String[] args) {
        System.setProperty("DSO_MASTER", "ALWAYS");
        DSO.noop();
        while (true) {

        }
    }
}
