
package za.co.bmw.workshop.day.two;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;


@ApplicationScoped
public class DayTwoLifeCycleBean {

    private static final Logger LOGGER = Logger.getLogger(DayTwoLifeCycleBean.class);

    void onStart(@Observes StartupEvent event){
        LOGGER.info("DayTwoLifeCycleBean::StartupEvent - startup method");
    }

    void onStop(@Observes ShutdownEvent event){
        LOGGER.info("DayTwoLifeCycleBean::ShutdownEvent - shutdown method");
    }
}
