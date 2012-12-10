package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.PersonnelDao;
import com.bsuir.matveyenka.entity.Personnel;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class PersonnelDaoImpl extends GenericDaoImpl<Personnel> implements PersonnelDao {

    public PersonnelDaoImpl() {
        super(Personnel.class);
    }
}
