package hello.javaee7.bean;

import hello.javaee7.jpa.Employee;
import hello.javaee7.jpa.EmployeeDb;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Bb5 {
    
    @EJB
    EmployeeDb db;
    
    @PostConstruct
    public void pc() {
        db.create(new Employee(1, "hi", "test@test.com"));
        db.create(new Employee(2, "hi", "test@test.com"));
    }
    
    public List<Employee> findAll() {
        return db.findAll();
    }
}
