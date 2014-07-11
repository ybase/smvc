package com.ybase.demo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ybase.vo.DrUser;

@Repository
public class UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public List<DrUser> getAllUser() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from t_user");
		return query.list();
	}

}
