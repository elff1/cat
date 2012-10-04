package com.test.cat;

import java.util.List;

public class CatServiceImpl implements ICatService {
	private ICatDao catDao;
	
	@Override
	public void createCat(Cat cat) {
		if (catDao.findCatByName(cat.getName()) != null)
			throw new RuntimeException("Cat " + cat.getName() + " is existed.");
		catDao.createCat(cat);
	}

	@Override
	public List<Cat> listCats() {
		return catDao.listCats();
	}

	@Override
	public int getCatsCount() {
		return catDao.getCatsCount();
	}

	public ICatDao getCatDao() {
		return catDao;
	}

	public void setCatDao(ICatDao catDao) {
		this.catDao = catDao;
	}

}
