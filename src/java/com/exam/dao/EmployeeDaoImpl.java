package com.exam.dao;


import com.exam.model.Employee;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public Employee save(Employee employee) {
       sessionFactory.getCurrentSession().save(employee);
        return null;
    }
    
    
}
