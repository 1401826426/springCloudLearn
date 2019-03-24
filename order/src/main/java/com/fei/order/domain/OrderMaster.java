package com.fei.order.domain;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class OrderMaster {

	@Id
	private String orderId;

	//买家名字
	private String buyerName;

	//买家电话
	private String buyerPhone;

	//买家地址
	private String buyerAddress;

	//买家微信openid
	private String buyerOpenid;

	//订单总金额
	private BigDecimal orderAmount;

	//订单状态, 默认为新下单
	private byte orderStatus;

	//支付状态, 默认未支付
	private byte payStatus;

	//创建时间
	private Date createTime;

	//修改时间
	private Date updateTime;

	public void setOrderId(String orderId){
	    this.orderId = orderId;
	}

	public String getOrderId(){
	    return orderId;
	}

	public void setBuyerName(String buyerName){
	    this.buyerName = buyerName;
	}

	public String getBuyerName(){
	    return buyerName;
	}

	public void setBuyerPhone(String buyerPhone){
	    this.buyerPhone = buyerPhone;
	}

	public String getBuyerPhone(){
	    return buyerPhone;
	}

	public void setBuyerAddress(String buyerAddress){
	    this.buyerAddress = buyerAddress;
	}

	public String getBuyerAddress(){
	    return buyerAddress;
	}

	public void setBuyerOpenid(String buyerOpenid){
	    this.buyerOpenid = buyerOpenid;
	}

	public String getBuyerOpenid(){
	    return buyerOpenid;
	}

	public BigDecimal getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(BigDecimal orderAmount) {
		this.orderAmount = orderAmount;
	}

	public void setOrderStatus(byte orderStatus){
	    this.orderStatus = orderStatus;
	}

	public byte getOrderStatus(){
	    return orderStatus;
	}

	public void setPayStatus(byte payStatus){
	    this.payStatus = payStatus;
	}

	public byte getPayStatus(){
	    return payStatus;
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