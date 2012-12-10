package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.BasketDao;
import com.bsuir.matveyenka.entity.Basket;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class BasketDaoImpl extends GenericDaoImpl<Basket> implements BasketDao {

    public BasketDaoImpl() {
        super(Basket.class);
    }
}
