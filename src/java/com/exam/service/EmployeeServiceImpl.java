/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;


import com.exam.dao.EmployeeDao;

import com.exam.model.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Instructor
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeDao employeeDao;

    @Override
    public Employee save(Employee employee) {
        employeeDao.save(employee);
       return null;
    }
   
  
}
