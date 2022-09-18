package hello.javaee7.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter @Setter
public class RegisterBean {
    private Integer number;
    private String name;
    
    public void toConsole() {
        System.out.println("number=" + this.number + " name=" + this.name);
    }
    
    public String next() {
        System.out.println("number=" + this.number + " name=" + this.name);
        return "/sample01/output";
    }
}
