package com.bsuir.matveyenka.dao.factory;

import com.bsuir.matveyenka.dao.*;
import com.bsuir.matveyenka.dao.impl.BasketDaoImpl;
import com.bsuir.matveyenka.entity.Equipment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class AbstractFactoryDao {

    @Autowired
    private BasketDao basketDao;

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private EquipmentDao equipmentDao;

    @Autowired
    private FactoryDao factoryDao;

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private PersonnelDao personnelDao;

    @Autowired
    private ProfitDao profitDao;

    @Autowired
    private ProductionDao productionDao;

    @Autowired
    private ProductionRWDao productionRWDao;

    @Autowired
    private RawMaterialDao rawMaterialDao;

    @Autowired
    private SizeDao sizeDao;

    public BasketDao getBasketDao() {
        return basketDao;
    }

    public ClientDao getClientDao() {
        return clientDao;
    }

    public EquipmentDao getEquipmentDao() {
        return equipmentDao;
    }

    public FactoryDao getFactoryDao() {
        return factoryDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public PersonnelDao getPersonnelDao() {
        return personnelDao;
    }

    public ProfitDao getProfitDao() {
        return profitDao;
    }

    public ProductionDao getProductionDao() {
        return productionDao;
    }

    public ProductionRWDao getProductionRWDao() {
        return productionRWDao;
    }

    public RawMaterialDao getRawMaterialDao() {
        return rawMaterialDao;
    }

    public SizeDao getSizeDao() {
        return sizeDao;
    }
}
