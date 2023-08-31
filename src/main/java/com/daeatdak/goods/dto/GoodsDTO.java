package com.daeatdak.goods.dto;

public class GoodsDTO {
//	goods_num int unsigned auto_increment primary key,
//	category_num int unsigned NOT NULL,
//	goods_name	varchar(50)	NOT NULL,
//	goods_price	int	NOT NULL,
//	goods_quantity	int	NOT null default 0,
//	sale_count	int	default 0 NOT null,

	private int goodsNumber;
	private int categoryNumber;
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
	private int saleCount;
	
	public GoodsDTO() {
		super();
	}

	public int getGoodsNumber() {
		return goodsNumber;
	}

	public void setGoodsNumber(int goodsNumber) {
		this.goodsNumber = goodsNumber;
	}

	public int getCategoryNumber() {
		return categoryNumber;
	}

	public void setCategoryNumber(int categoryNumber) {
		this.categoryNumber = categoryNumber;
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

	public int getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

	@Override
	public String toString() {
		
		return goodsNumber  + "," + categoryNumber + "," + goodsName + "," + goodsPrice + "," + goodsQuantity + "," + saleCount;
	}
}
