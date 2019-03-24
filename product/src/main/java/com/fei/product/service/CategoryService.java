package com.fei.product.service;

import com.fei.product.dao.ProductCategoryRepository;
import com.fei.product.domain.ProductCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService  {

    @Autowired
    private ProductCategoryRepository productCategoryRepository ;


    public List<ProductCategory> getByTypeIn(List<Integer> types) {
        return productCategoryRepository.findByCategoryTypeIn(types) ;
    }

}
