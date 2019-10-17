/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.controller;

import com.exam.model.Contact;
import java.util.List;
import org.springframework.http.ResponseEntity;

/**
 *
 * @author Instructor
 */
public interface IContactController {

    public Contact save(Contact contact);

    
}
