package hello.javaee7.bean;

import java.util.logging.Logger;
import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import javax.inject.Inject;

@Dependent
public class LoggerProducer {
    
    @Inject
    InjectionPoint point;
    
    @Produces
    public Logger createLogger() {
        String className = point.getMember().getDeclaringClass().getName();
        Logger logger = Logger.getLogger(className);
        return logger;
    }
}
