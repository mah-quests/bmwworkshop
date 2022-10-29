
package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: just before the DayTwoMain.main() method call ...");
        Quarkus.run(DayTwoMain.class, args);
    }

    public static class DayTwoMain implements QuarkusApplication {
        @Override
        public int run(String[] args) throws Exception {
            System.out.println("DayTwoMain Class: inside the main method here...");
            Quarkus.waitForExit();
            return 0;
        }
    }
}
