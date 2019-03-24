package com.fei.product.controller;

import com.fei.product.VO.ProductInfoVO;
import com.fei.product.VO.ProductVO;
import com.fei.product.VO.ResultVO;
import com.fei.product.domain.ProductCategory;
import com.fei.product.domain.ProductInfo;
import com.fei.product.service.CategoryService;
import com.fei.product.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService ;

    @Autowired
    private CategoryService categoryService ;

    @RequestMapping(value =  "/list",method =  RequestMethod.GET)
    @ResponseBody
    public ResultVO<List<ProductVO>> list(){
        List<ProductInfo> productInfos = productService.getAllUpProduct() ;
        List<Integer> categoryList = productInfos.stream().map(ProductInfo::getCategoryType).collect(Collectors.toList());
        List<ProductCategory> productCategories = categoryService.getByTypeIn(categoryList) ;
        List<ProductVO> productVOList = new ArrayList<>();
        for(ProductCategory pc:productCategories){
            ProductVO productVO = new ProductVO() ;
            productVO.setCatType(pc.getCategoryType());
            productVO.setCatName(pc.getCategoryName());
            List<ProductInfoVO> productInfoList = new ArrayList<>( );
            for(ProductInfo productInfo:productInfos){
                ProductInfoVO productInfoVO = new ProductInfoVO() ;
                BeanUtils.copyProperties(productInfo,productInfoVO);
                productInfoList.add(productInfoVO) ;
            }
            productVO.setProductInfoVOList(productInfoList);
            productVOList.add(productVO) ;
        }
        return ResultVO.ok(productVOList) ;
    }

}
