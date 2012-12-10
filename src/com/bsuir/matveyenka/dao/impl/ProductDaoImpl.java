package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.ProductDao;
import com.bsuir.matveyenka.entity.Product;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class ProductDaoImpl extends GenericDaoImpl<Product> implements ProductDao {

    public ProductDaoImpl() {
        super(Product.class);
    }
}
