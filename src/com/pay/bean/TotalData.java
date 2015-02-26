package com.pay.bean;

import java.util.List;

public class TotalData {

	private List<Goods> goods;//shangpin
	private String commid;//商户ID
	private String orderId;//订单ID


	public String getCommid() {
		return commid;
	}
	public void setCommid(String commid) {
		this.commid = commid;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public TotalData() {
		super();
	}
	public List<Goods> getGoods() {
		return goods;
	}
	public void setGoods(List<Goods> goods) {
		this.goods = goods;
	}
	public TotalData(List<Goods> goods, String commid, String orderId) {
		super();
		this.goods = goods;
		this.commid = commid;
		this.orderId = orderId;
	}

}
