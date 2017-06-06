package com.authority.service;


import com.authority.dao.PersonDao;
import com.authority.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Vincent on 2017/5/10.
 */
@Service("personService")
@Transactional
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    public void savePerson(Person person) {
        personDao.save(person);
    }
}
