package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.ProductionRWDao;
import com.bsuir.matveyenka.entity.ProductionRW;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class ProductionRWDaoImpl extends GenericDaoImpl<ProductionRW> implements ProductionRWDao {

    public ProductionRWDaoImpl() {
        super(ProductionRW.class);
    }
}
