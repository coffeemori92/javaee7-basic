package hello.javaee7.bean;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class TimeService {
    
    @Inject
    transient LoggerProducer logger;
    
}
