package dso.test;

import dso.DSO;

public class TestClient {

    public static void main(String[] args) {
        BigData b = Test.setup();

        while (true) {
            try {
                System.setProperty("DSO_MASTER", "NEVER");
                long t = System.currentTimeMillis();
                // DSO.share(b);
                t = t - System.currentTimeMillis();
                Thread.sleep(300);
                DSO.lock(b, null);
                DSO.share(b);
                Thread.sleep(3000);
                DSO.unlock(b, null);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
