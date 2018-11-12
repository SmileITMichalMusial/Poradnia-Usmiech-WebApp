package pl.poradniausmiech.dao;

import pl.poradniausmiech.domain.Employee;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EmployeesDao {

    List<Employee> getEmployeesListFromDB();

    List<Employee> getActiveEmployeesListFromDB();

    Employee read(int id);

    void modifyEmployeeDb(Employee employee);

    void markEmployeeAsInactiveInDb(int id);

    void markEmployeeAsActiveInDb(int id);

    void saveEmployeeToDb(Employee employee);
}
