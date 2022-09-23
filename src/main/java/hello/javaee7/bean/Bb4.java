package hello.javaee7.bean;

import hello.javaee7.jpa.Employee;
import hello.javaee7.jpa.EmployeeDb;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Named
@Getter @Setter
@RequestScoped
public class Bb4 {
    
    @EJB
    EmployeeDb db;
    
    @NotNull
    private Integer number;
    
    @Size(min = 1, max = 20)
    private String name;
    
    @Size(min = 1, max = 30)
    private String mail;
    
    public String next() {
        create();
        return null;
    }
    
    public String create() {
        Employee emp = new Employee(number, name, mail);
        try {
            db.create(emp);
            clear();
        } catch (Exception e) {
            
        }
        return null;
    }
    
    public String update() {
        Employee emp = new Employee(number, name, mail);
        try {
            db.update(emp);
        } catch(Exception e) {
            
        }
        return null;
    }
    
    public String find() {
        Employee emp = db.find(number);
        if (emp != null) {
            this.number = emp.getNumber();
            this.name = emp.getName();
            this.mail = emp.getMail();
        }
        return null;
    }
    
    public String delete(Employee emp) {
        db.delete(emp);
        return null;
    }
    
    public List<Employee> findAll() {
        return db.findAll();
    }
    
    public void clear() {
        number = null;
        name = null;
        mail = null;
    }
}
