package com.fei.product.domain;
import java.util.Date;

public class UserInfo {

	//
	private String id;

	//
	private String username;

	//
	private String password;

	//微信openid
	private String openid;

	//1买家2卖家
	private String role;

	//创建时间
	private Date createTime;

	//修改时间
	private Date updateTime;

	public void setId(String id){
	    this.id = id;
	}

	public String getId(){
	    return id;
	}

	public void setUsername(String username){
	    this.username = username;
	}

	public String getUsername(){
	    return username;
	}

	public void setPassword(String password){
	    this.password = password;
	}

	public String getPassword(){
	    return password;
	}

	public void setOpenid(String openid){
	    this.openid = openid;
	}

	public String getOpenid(){
	    return openid;
	}

	public void setRole(String role){
	    this.role = role;
	}

	public String getRole(){
	    return role;
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