package com.authority.controller;


import com.authority.entity.Person;
import com.authority.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

/**
 * Created by Vincent on 2017/5/10.
 */
@Controller
@RequestMapping("/person")
@SessionAttributes(value = {"person"})
public class PersonController {

    private static final String SUCCESS = "success";


    @Autowired
    private PersonService personService;

    @ModelAttribute
    @RequestMapping(value = "/saveByPerson", method = RequestMethod.POST)
    public String saveByPerson(Person person){
        Date time = new Date();
        Person p = new Person();
        p.setCreateTime(time);
        personService.savePerson(person);
        System.out.println("Person " + person);
        return SUCCESS;
    }
}
