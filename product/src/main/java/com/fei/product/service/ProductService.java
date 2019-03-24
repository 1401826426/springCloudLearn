package com.fei.product.service;

import com.fei.product.dao.ProductInfoRepository;
import com.fei.product.domain.ProductInfo;
import com.fei.product.util.ProductStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository ;

    public List<ProductInfo> getAllUpProduct(){
        return productInfoRepository.findByProductStatus(ProductStatus.UP.getStatus()) ;
    }

}
