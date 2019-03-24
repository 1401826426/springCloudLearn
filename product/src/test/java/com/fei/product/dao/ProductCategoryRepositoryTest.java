package com.fei.product.dao;

import com.fei.product.domain.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository productCategoryRepository ;

    @Test
    public void testFindByType(){
        List<Integer> list = new ArrayList<>() ;
        list.add(11) ;
        list.add(22) ;
        List<ProductCategory> productCategories = productCategoryRepository.findByCategoryTypeIn(list) ;
        System.out.println(productCategories.size()) ;
    }

}