package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.Startup;
import org.jboss.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

@Startup
public class DayTwoStartUp {
    private static final Logger LOGGER = Logger.getLogger(DayTwoLifeCycleBean.class);

    @Inject
    DeveloperResource bmwDeveloperResource;

    @PostConstruct
    public void init(){
        LOGGER.info("DayTwoStartUp: init() method - inside the Startup class");
    }

    @PreDestroy
    public void beforeDestroy(){
        LOGGER.info("DayTwoStartUp: beforeDestroy() method - this is post the Startup class");
    }

}
