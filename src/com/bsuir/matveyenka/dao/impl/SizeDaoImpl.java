package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.SizeDao;
import com.bsuir.matveyenka.entity.Size;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class SizeDaoImpl extends GenericDaoImpl<Size> implements SizeDao {

    public SizeDaoImpl() {
        super(Size.class);
    }
}
