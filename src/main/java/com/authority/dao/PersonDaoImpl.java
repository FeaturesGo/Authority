package com.authority.dao;

import com.authority.entity.Person;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * Created by Vincent on 2017/5/10.
 */
@Repository
public class PersonDaoImpl implements PersonDao{

    private static final Logger logger = LoggerFactory.getLogger(PersonDaoImpl.class);

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Person person) {
        logger.info("保存成功=====》》》" + person);
        sessionFactory.getCurrentSession().save(person);
    }
}
