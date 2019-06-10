package com.techwizzle.backend.dao;

import com.techwizzle.backend.model.GraphicsCard;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

@NoArgsConstructor
public class GraphicsCardDAO implements DAOInterface<GraphicsCard, Integer> {

    private Session currentSession;

    private Transaction currentTransaction;

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
        return sessionFactory;
    }

    public Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    @Override
    public void persist(GraphicsCard entity) {
        getCurrentSession().save(entity);
    }

    @Override
    public void update(GraphicsCard entity) {

    }

    @Override
    public GraphicsCard findById(Integer integer) {
        return null;
    }

    @Override
    public void delete(GraphicsCard entity) {

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<GraphicsCard> findAll() {
        List<GraphicsCard> graphicsCardList = (List<GraphicsCard>) getCurrentSession().createQuery("from GraphicsCard").list();
        return graphicsCardList;
    }

    @Override
    public void deleteAll() {

    }
}
