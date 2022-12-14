package spring.rest.dao;
import spring.rest.entity.Employee;
import java.util.List;

public interface EmployeeDao {

    List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
