package com.exam.dao;

import com.exam.model.Contact;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDaoImpl implements ContactDao{
    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public Contact save(Contact contact) {
        sessionFactory.getCurrentSession()
                .save(contact);
        return null;
    }
    
}
