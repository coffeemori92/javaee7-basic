package hello.javaee7.bean;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb1 {
    
    @EJB
    private GlobalMemo bean1;

    public GlobalMemo getBean1() {
        return bean1;
    }

    public void setBean1(GlobalMemo bean1) {
        this.bean1 = bean1;
    }
    
    public String next() {
        return "/sample18/index_2";
    }
}
