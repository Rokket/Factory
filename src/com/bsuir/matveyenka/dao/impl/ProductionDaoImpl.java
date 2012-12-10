package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.ProductionDao;
import com.bsuir.matveyenka.entity.Production;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class ProductionDaoImpl extends GenericDaoImpl<Production> implements ProductionDao {

    public ProductionDaoImpl() {
        super(Production.class);
    }
}
