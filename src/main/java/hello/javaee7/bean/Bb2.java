package hello.javaee7.bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter @Setter
public class Bb2 {
    
    @EJB
    private GlobalMemo bean2;
    
    public String next() {
        return "/sample18/index";
    }
    
}
