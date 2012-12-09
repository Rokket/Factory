package com.bsuir.matveyenka.dao.impl;

import com.bsuir.matveyenka.dao.GenericDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * User: User
 * Date: 09/12/12
 */
public class GenericDaoImpl<ENTITY> implements GenericDao<ENTITY> {

    private Class<ENTITY> type;

    private SessionFactory sessionFactory;

    public GenericDaoImpl(Class<ENTITY> type) {
        this.type = type;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(ENTITY entity) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

    @Override
    public ENTITY get(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        ENTITY entity = (ENTITY) session.get(type, id);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void update(ENTITY entity) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void remove(ENTITY entity) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        session.delete(entity);
        session.getTransaction().commit();
    }
}
