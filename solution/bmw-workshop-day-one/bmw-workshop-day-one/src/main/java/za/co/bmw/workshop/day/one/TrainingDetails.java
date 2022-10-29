package za.co.bmw.workshop.day.one;

import io.smallrye.config.ConfigMapping;

@ConfigMapping(prefix = "bmwtraining")
public interface TrainingDetails {
    String date();
    String starttime();
    String endtime();
    String location();
    Log log();

    interface Log {
        boolean enabled();

        String suffix();

        boolean rotate();
    }
}
