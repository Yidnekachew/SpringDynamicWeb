package com.spring.dynamic.web.dao.impl;

import com.spring.dynamic.web.dao.HotelDao;
import com.spring.dynamic.web.model.Hotel;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelDaoImpl extends HibernateDaoSupport implements HotelDao {

    public Hotel get(Long id) {
        return getHibernateTemplate().get(Hotel.class, id);
    }

    public void save(Hotel hotel) {
        getHibernateTemplate().saveOrUpdate(hotel);
    }

    public void delete(Hotel hotel) {
        getHibernateTemplate().delete(hotel);
    }

    @SuppressWarnings("unchecked")
    public List<Hotel> findAll() {
        return (List<Hotel>) getHibernateTemplate().find("FROM Hotel");
    }

}
