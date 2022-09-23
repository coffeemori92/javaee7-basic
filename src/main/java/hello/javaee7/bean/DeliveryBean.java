package hello.javaee7.bean;

import java.io.Serializable;
import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@ConversationScoped
@Getter @Setter
public class DeliveryBean implements Serializable {
    
    private final Conversation conv;

    @Inject
    public DeliveryBean(Conversation conv) {
        this.conv = conv;
    }
   
    private String product;
    private Integer quantity;
    private String name;
    private String address;

    public String goto_1() {
        if (conv.isTransient()) {
            conv.begin();
        } else {
            System.out.println("1번째 화면 conversation 스코프 개시");
        }
        return "/sample17/view_1.xhtml";
    }
    
    public String goto_2() {
        System.out.println("2번째 화면");
        return "/sample17/view_2.xhtml";
    }
    
    public String goto_3() {
        System.out.println("3번째 화면");
        return "/sample17/view_3.xhtml";
    }
    
    public String goto_0() {
        conv.end();
        System.out.println("시작 화면 conversation 스코프 종료");
        return "/sample17/index.xhtml";
    }
}
