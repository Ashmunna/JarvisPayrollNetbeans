package com.exam.controller;

import com.exam.model.Contact;
import com.exam.service.ContactService;
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
public class ContactController implements IContactController {

    @Autowired
    ContactService contactService;

    @RequestMapping(value = "/savecontact", method = RequestMethod.POST)
    @Override
    public Contact save(@RequestBody Contact contact) {
        
        return contactService.save(contact);
    }


    
    


   
}
