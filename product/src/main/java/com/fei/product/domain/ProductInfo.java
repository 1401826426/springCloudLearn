package com.fei.product.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class ProductInfo {

	@Id
	private String productId;

	//商品名称
	private String productName;

	//单价
	private BigDecimal productPrice;

	//库存
	private int productStock;

	//描述
	private String productDescription;

	//小图
	private String productIcon;

	//商品状态,0正常1下架
	private int productStatus;

	//类目编号
	private int categoryType;

	//创建时间
	private Date createTime;

	//修改时间
	private Date updateTime;

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

	public void setProductPrice(BigDecimal productPrice){
	    this.productPrice = productPrice;
	}

	public BigDecimal getProductPrice(){
	    return productPrice;
	}

	public void setProductStock(int productStock){
	    this.productStock = productStock;
	}

	public int getProductStock(){
	    return productStock;
	}

	public void setProductDescription(String productDescription){
	    this.productDescription = productDescription;
	}

	public String getProductDescription(){
	    return productDescription;
	}

	public void setProductIcon(String productIcon){
	    this.productIcon = productIcon;
	}

	public String getProductIcon(){
	    return productIcon;
	}

	public void setProductStatus(byte productStatus){
	    this.productStatus = productStatus;
	}

	public int getProductStatus(){
	    return productStatus;
	}

	public void setCategoryType(int categoryType){
	    this.categoryType = categoryType;
	}

	public int getCategoryType(){
	    return categoryType;
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