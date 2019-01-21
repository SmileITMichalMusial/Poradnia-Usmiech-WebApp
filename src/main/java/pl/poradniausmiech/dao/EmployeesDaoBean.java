package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EmployeesDaoBean implements EmployeesDao {

    private List<Employee> employeeList = new ArrayList<>();
    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");

    @Override
    public List<Employee> getEmployeesListFromDB() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        employeeList = entityManager.createQuery("FROM Employee order by orderId").getResultList();

        return employeeList;
    }


    @Override
    public Employee read(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public void modifyEmployeeDb(Employee employee) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.merge(employee);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void markEmployeeAsInactiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Employee employee = read(id);
        System.out.println("Employee id: " + id);
        System.out.println("Employee status: " + employee.getActive());
        System.out.println("Setting up as inactive...");
        employee.setActive(false);
        System.out.println("Employee status: " + employee.getActive());
        entityManager.merge(employee);
        entityTransaction.commit();
        entityManager.close();


    }

    @Override
    public void markEmployeeAsActiveInDb(int id) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Employee employee = read(id);
        System.out.println("Employee id: " + id);
        System.out.println("Employee status: " + employee.getActive());
        System.out.println("Setting up as inactive...");
        employee.setActive(true);
        System.out.println("Employee status: " + employee.getActive());
        entityManager.merge(employee);
        entityTransaction.commit();
        entityManager.close();
    }

    @Override
    public void saveEmployeeToDb(Employee employee) {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(employee);
        transaction.commit();
        entityManager.close();
    }


}
