package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.EquipmentDao;
import com.bsuir.matveyenka.entity.Equipment;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class EquipmentDaoImpl extends GenericDaoImpl<Equipment> implements EquipmentDao {

    public EquipmentDaoImpl() {
        super(Equipment.class);
    }
}
