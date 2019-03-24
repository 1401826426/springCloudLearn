package com.fei.order.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OrderDetail {

	@Id
	private String detailId;

	//
	private String orderId;

	//
	private String productId;

	//商品名称
	private String productName;

	//当前价格,单位分
	private BigDecimal productPrice;

	//数量
	private int productQuantity;

	//小图
	private String productIcon;

	//创建时间
	private Date createTime;

	//修改时间
	private Date updateTime;

	public void setDetailId(String detailId){
	    this.detailId = detailId;
	}

	public String getDetailId(){
	    return detailId;
	}

	public void setOrderId(String orderId){
	    this.orderId = orderId;
	}

	public String getOrderId(){
	    return orderId;
	}

	public void setProductId(String productId){
	    this.productId = productId;
	}

	public String getProductId(){
	    return productId;
	}

	public void setProductName(String productName){
	    this.productName = productName;
	}

	public String getProductName(){
	    return productName;
	}

	public BigDecimal getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(BigDecimal productPrice) {
		this.productPrice = productPrice;
	}

	public void setProductQuantity(int productQuantity){
	    this.productQuantity = productQuantity;
	}

	public int getProductQuantity(){
	    return productQuantity;
	}

	public void setProductIcon(String productIcon){
	    this.productIcon = productIcon;
	}

	public String getProductIcon(){
	    return productIcon;
	}

	public void setCreateTime(Date createTime){
	    this.createTime = createTime;
	}

	public Date getCreateTime(){
	    return createTime;
	}

	public void setUpdateTime(Date updateTime){
	    this.updateTime = updateTime;
	}

	public Date getUpdateTime(){
	    return updateTime;
	}

}