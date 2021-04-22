package com.mall.service;

import com.mall.pojo.Category;
import com.mall.util.Page;

import java.util.List;

public interface CategoryService {
    List<Category> list();

    void add(Category category);
    void delete(int id);
    Category get(int id);
    void update(Category category);
}
