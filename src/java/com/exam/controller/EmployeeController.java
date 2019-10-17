package com.exam.controller;


import com.exam.model.Employee;

import com.exam.service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EmployeeController implements IEmployeeController{

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(value = "/saveemployee", method = RequestMethod.POST)
    @Override
    public Employee save(@RequestBody Employee employee) {
        
        employeeService.save(employee);
        return null;
    }

   


  
   

    
}
