package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.RawMaterialDao;
import com.bsuir.matveyenka.entity.RawMaterial;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class RawMaterialDaoImpl extends GenericDaoImpl<RawMaterial> implements RawMaterialDao {

    public RawMaterialDaoImpl() {
        super(RawMaterial.class);
    }
}
