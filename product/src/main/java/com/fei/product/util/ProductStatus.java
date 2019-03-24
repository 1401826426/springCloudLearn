package com.fei.product.util;

public enum ProductStatus {

    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private int status ;

    private String msg ;

    private ProductStatus(int status,String msg){
        this.status = status ;
        this.msg = msg ;
    }

    public int getStatus(){
        return status ;
    }


}
