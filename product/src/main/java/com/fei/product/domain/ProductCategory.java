package com.fei.product.domain;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class ProductCategory {

	@Id
	@GeneratedValue
	private int categoryId;

	//类目名字
	private String categoryName;

	//类目编号
	private int categoryType;

	//创建时间
	private Date createTime;

	//修改时间
	private Date updateTime;

	public void setCategoryId(int categoryId){
	    this.categoryId = categoryId;
	}

	public int getCategoryId(){
	    return categoryId;
	}

	public void setCategoryName(String categoryName){
	    this.categoryName = categoryName;
	}

	public String getCategoryName(){
	    return categoryName;
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