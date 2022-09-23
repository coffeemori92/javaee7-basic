package hello.javaee7.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Employee implements Serializable {

    public Employee() {
    }
    
    @Id
    private Integer number;
    private String name;
    private String mail;
    
}
