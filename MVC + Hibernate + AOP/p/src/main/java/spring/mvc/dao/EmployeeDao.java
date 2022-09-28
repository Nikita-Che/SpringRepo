package spring.mvc.dao;


import spring.mvc.entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAllEmployees();

}
