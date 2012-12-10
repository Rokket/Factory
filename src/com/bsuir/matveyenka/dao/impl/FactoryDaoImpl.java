package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.FactoryDao;
import com.bsuir.matveyenka.entity.Factory;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class FactoryDaoImpl extends GenericDaoImpl<Factory> implements FactoryDao {

    public FactoryDaoImpl() {
        super(Factory.class);
    }
}
