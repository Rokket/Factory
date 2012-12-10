package com.bsuir.matveyenka.dao;

import java.util.List;

/**
 * User: User
 * Date: 09/12/12
 */
public interface GenericDao<ENTITY> {

    void save(ENTITY entity);

    ENTITY get(Long id);

    void update(ENTITY entity);

    void remove(ENTITY entity);

    List<ENTITY> getList();
}
