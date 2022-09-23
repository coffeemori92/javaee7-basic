package hello.javaee7.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter @Setter
public class Bb3 {
    
    {
        System.out.println("초기화 블럭");
    }
    
    public Bb3() {
        System.out.println("생성자 호출 블럭");
    }
   
    private Integer number;
    private String name;

    @Inject
    LoggerProducer logger;

    @PostConstruct
    public void start() {
        System.out.println("post construct");
    }
    
    @PreDestroy
    public void end() {
        System.out.println("pre destroy");
    }
    
    public String next() {
        return "";
    }
    
}
