package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.OrderDao;
import com.bsuir.matveyenka.entity.Order;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {

    public OrderDaoImpl() {
        super(Order.class);
    }
}
