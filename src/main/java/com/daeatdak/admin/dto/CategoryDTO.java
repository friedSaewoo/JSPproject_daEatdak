package com.daeatdak.admin.dto;

public class CategoryDTO {
	private int categoryNum;
	private String categoryName;
	
	public CategoryDTO() {
		;
	}

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	@Override
	public String toString() {
		return "CategoryDTO [categoryNum=" + categoryNum + ", categoryName=" + categoryName + "]";
	}
	
	
}
