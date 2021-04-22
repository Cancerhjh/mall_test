package com.mall.service;

import com.mall.pojo.ProductImage;

import java.util.List;

public interface ProductImageService {
    /*两个常量，分别表示单个图片和详情图片*/
    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);
    void delete(int id);
    void update(ProductImage pi);
    ProductImage get(int id);
    List list(int pid, String type);
}
