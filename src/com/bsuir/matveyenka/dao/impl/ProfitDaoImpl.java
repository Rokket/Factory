package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.ProfitDao;
import com.bsuir.matveyenka.entity.Profit;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class ProfitDaoImpl extends GenericDaoImpl<Profit> implements ProfitDao {

    public ProfitDaoImpl() {
        super(Profit.class);
    }
}
