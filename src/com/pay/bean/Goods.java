package com.pay.bean;

public class Goods {

	private String onlynum;//��ƷΨһ���
	private String name;//����
	private String img;//��ƷͼƬ��ַ
	private String num;//����
	private String price;//����
	private String totalPrice;//�ܼ�
	private String freight;//�˷�
	private String sale;//�ۿۼ۸�
	public Goods() {
		super();
		
	}
	public Goods(String onlynum, String name, String img, String num,
			String price, String totalPrice, String freight, String sale) {
		super();
		this.onlynum = onlynum;
		this.name = name;
		this.img = img;
		this.num = num;
		this.price = price;
		this.totalPrice = totalPrice;
		this.freight = freight;
		this.sale = sale;
	}
	public String getOnlynum() {
		return onlynum;
	}
	public void setOnlynum(String onlynum) {
		this.onlynum = onlynum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getFreight() {
		return freight;
	}
	public void setFreight(String freight) {
		this.freight = freight;
	}
	public String getSale() {
		return sale;
	}
	public void setSale(String sale) {
		this.sale = sale;
	}
}
