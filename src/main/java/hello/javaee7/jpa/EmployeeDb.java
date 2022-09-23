package hello.javaee7.jpa;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class EmployeeDb {
    
    @PersistenceContext
    private EntityManager em;
    
    public void create(Employee employee) {
        em.persist(employee);
    }
    
    public void update(Employee employee) {
        em.merge(employee);
    }
    
    public Employee find(Integer key) {
        return em.find(Employee.class, key);
    }
    
    public void delete(Employee employee) {
        em.remove(em.merge(employee));
    }
    
    public List<Employee> findAll() {
        return em.createQuery("select e from Employee e").getResultList();
    }
}
