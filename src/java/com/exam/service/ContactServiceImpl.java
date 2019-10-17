/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.service;

import com.exam.dao.ContactDao;
import com.exam.model.Contact;
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
public class ContactServiceImpl implements ContactService{
    @Autowired
    ContactDao contactDao;
    
    @Override
    public Contact save(Contact contact) {
        return contactDao.save(contact);
    }


    
}
