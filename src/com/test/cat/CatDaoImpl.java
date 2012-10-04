package com.test.cat;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CatDaoImpl extends HibernateDaoSupport implements ICatDao {

	@Override
	public void createCat(Cat cat) {
		this.getHibernateTemplate().persist(cat);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cat> listCats() {
		return this.getHibernateTemplate().find(" select c from Cat c ");
	}

	@Override
	public int getCatsCount() {
		Number n = (Number)this.getSession(true).createQuery(" select count(c) from Cat c ").uniqueResult();
		return n.intValue();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Cat findCatByName(String name) {
		List<Cat> catList = this.getHibernateTemplate().find(" select c from Cat c where c.name = ? ", name);
		if (catList.size() > 0)
			return catList.get(0);
		return null;
	}

}
