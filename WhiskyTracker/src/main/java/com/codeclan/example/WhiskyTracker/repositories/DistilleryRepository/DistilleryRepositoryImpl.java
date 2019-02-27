package com.codeclan.example.WhiskyTracker.repositories.DistilleryRepository;

import com.codeclan.example.WhiskyTracker.models.Distillery;
import com.codeclan.example.WhiskyTracker.models.Whisky;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class DistilleryRepositoryImpl implements DistilleryRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional


    public List<Distillery> findDistilleriesForARegion(String region) {
        List<Distillery> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {

            Criteria cr = session.createCriteria(Distillery.class);

            cr.add(Restrictions.eq("region", region));
            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    @Transactional


    public List<Distillery> findDistilleriesWithTwelveYrOldWhiskys() {
        List<Distillery> result = null;

        Session session = entityManager.unwrap(Session.class);

        try {

            Criteria cr = session.createCriteria(Distillery.class);
            cr.createAlias("whiskies", "whiskyAlias");
            cr.add(Restrictions.eq("whiskyAlias.age", 12));


            result = cr.list();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        return result;
    }





}
