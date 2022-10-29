package za.co.bmw.workshop.kyalami.otherbrands;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import io.quarkus.runtime.configuration.ProfileManager;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

public class RaceCarsApplicationLifeCycle {
    private static final Logger LOGGER = Logger.getLogger(RaceCarsApplicationLifeCycle.class);

    void onStart(@Observes StartupEvent ev) {

        LOGGER.info("====================================================================================================");
        LOGGER.info("                                                                           ");
        LOGGER.info(" /$$$$$$$                      /$$                            /$$$$$$                               ");
        LOGGER.info("| $$__  $$                    |__/                           /$$__  $$                              ");
        LOGGER.info("| $$    $$  /$$$$$$   /$$$$$$$ /$$ /$$$$$$$   /$$$$$$       | $$   __/  /$$$$$$   /$$$$$$   /$$$$$$$");
        LOGGER.info("| $$$$$$$/ |____  $$ /$$_____/| $$| $$__  $$ /$$__  $$      | $$       |____  $$ /$$__  $$ /$$_____/");
        LOGGER.info("| $$__  $$  /$$$$$$$| $$      | $$| $$    $$| $$    $$      | $$        /$$$$$$$| $$   __/|  $$$$$$ ");
        LOGGER.info("| $$    $$ /$$__  $$| $$      | $$| $$  | $$| $$  | $$      | $$    $$ /$$__  $$| $$        ____  $$");
        LOGGER.info("| $$  | $$|  $$$$$$$|  $$$$$$$| $$| $$  | $$|  $$$$$$$      |  $$$$$$/|  $$$$$$$| $$       /$$$$$$$/");
        LOGGER.info("|__/  |__/  _______/  _______/|__/|__/  |__/  ____  $$        ______    _______ |__/      |_______/ ");
        LOGGER.info("                                             /$$    $$                                              ");
        LOGGER.info("                                            |  $$$$$$/                                              ");
        LOGGER.info("                                              ______/                                               ");
        LOGGER.info("                                                                           ");
        LOGGER.info("  The application Racing Cars is starting with profile " + ProfileManager.getActiveProfile());
        LOGGER.info("====================================================================================================");
    }

    void onStop(@Observes ShutdownEvent ev) {
        LOGGER.info("The application Race Cars is stopping...");
    }
}
