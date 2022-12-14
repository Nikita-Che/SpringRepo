package com.spring.mvc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-detail-view";
//    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

//        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurname("Petrov");
//        employee.setSalary(200);
        model.addAttribute("employee", new Employee());

        return "ask-emp-detail-view";
    }

//    @RequestMapping(path = "/showDetails", method = RequestMethod.GET)
//    @GetMapping("/showDetails")
    @PostMapping("/showDetails")
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {

//        System.out.println("surname lenght " + employee.getSurname().length() );

        if (bindingResult.hasErrors()) {
            return "ask-emp-detail-view";
        } else {
            return "show-emp-details-view";
        }
    }

//        String name = employee.getName();
//        employee.setName(name+" pidorov");
//
//        String surname = employee.getSurname();
//        employee.setSurname(surname  +" govnov");
//
//        int salaryOld = employee.getSalary();
//        employee.setSalary(salaryOld+1000);


}

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName")String empName, Model model) {
//
//        empName = "MR. " + empName + "!!!";
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("showDetails")
//    public String showEmpDetails () {
//        return "show-emp-details-view";

//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails (HttpServletRequest request, Model model) {
//        String empName = request.getParameter("employeeName");
//        empName = "MR. " + empName;
//        model.addAttribute("nameAttribute", empName);
//
//        model.addAttribute("description","prosto chelovek");
//
//        return "show-emp-details-view";

//    }

