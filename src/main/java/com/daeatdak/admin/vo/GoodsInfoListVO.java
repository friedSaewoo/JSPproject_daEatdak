package com.daeatdak.admin.vo;

public class GoodsInfoListVO {
	
	private int goodsNumber;
	private String categoryName;
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
	
	
	public GoodsInfoListVO() {
		;
	}


	public int getGoodsNumber() {
		return goodsNumber;
	}


	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}


	public int getGoodsPrice() {
		return goodsPrice;
	}


	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}


	public int getGoodsQuantity() {
		return goodsQuantity;
	}


	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}


	@Override
	public String toString() {
		return "GoodsInfoListVO [goodsNumber=" + goodsNumber + ", categoryName=" + categoryName + ", goodsName="
				+ goodsName + ", goodsPrice=" + goodsPrice + ", goodsQuantity=" + goodsQuantity + "]";
	}
	
	
	
	
	
	
}