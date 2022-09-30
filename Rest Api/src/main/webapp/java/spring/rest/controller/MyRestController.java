package spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.rest.entity.Employee;
import spring.rest.exeptionHandling.EmployeeIncorrectData;
import spring.rest.exeptionHandling.NoSuchEmployeeException;
import spring.rest.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> showAllEmployees() {
        List<Employee> allEmployee = employeeService.getAllEmployees();

        return allEmployee;
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable int id) {

        Employee employee = employeeService.getEmployee(id);
        if (employee == null) {
            throw new NoSuchEmployeeException("Нет такова работника с таким АЙДИ " + id);
        }

        return employee;
    }

    @PostMapping("/employees")
    public Employee addNewEmployee (@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }

    @PutMapping("/employees")
    public Employee upDateEmployee (@RequestBody Employee employee) {

        employeeService.saveEmployee(employee);

        return employee;
    }


    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id) {
        Employee employee = employeeService.getEmployee(id);

        if (employee==null){
            throw new NoSuchEmployeeException("There is no employee with id " + id + " Nelzya udalit togo Kavo NET BLA! ");
        }

       employeeService.deleteEmployee(id);
       return "Employee with id = " + id + " was deleted URA BLA!";
    }
}
