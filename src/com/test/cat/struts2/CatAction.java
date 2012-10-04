package com.test.cat.struts2;

import java.util.ArrayList;
import java.util.List;

import com.test.cat.*;

public class CatAction {
	private ICatService catService;
	private Cat cat;
	private List<Cat> catList = new ArrayList<Cat>();
	
	public String add() {
		catService.createCat(cat);
		return list();
	}
	
	public String list() {
		catList = catService.listCats();
		return "list";
	}
	
	public ICatService getCatService() {
		return catService;
	}
	public void setCatService(ICatService catService) {
		this.catService = catService;
	}
	public Cat getCat() {
		return cat;
	}
	public void setCat(Cat cat) {
		this.cat = cat;
	}
	public List<Cat> getCatList() {
		return catList;
	}
	public void setCatList(List<Cat> catList) {
		this.catList = catList;
	}
}
