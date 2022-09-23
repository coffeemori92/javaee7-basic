package hello.javaee7.bean;

import java.io.Serializable;
import javax.ejb.Singleton;
import lombok.Getter;
import lombok.Setter;

@Singleton
@Getter @Setter
public class GlobalMemo implements Serializable {
    private String cache;
}
