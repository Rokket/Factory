package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.ClientDao;
import com.bsuir.matveyenka.entity.Client;
import org.springframework.stereotype.Repository;

/**
 * User: User
 * Date: 09/12/12
 */
@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {

    public ClientDaoImpl() {
        super(Client.class);
    }
}
