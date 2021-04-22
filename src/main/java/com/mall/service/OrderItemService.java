package com.mall.service;

import com.mall.pojo.Order;
import com.mall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
    void add(OrderItem c);

    void delete(int id);
    void update(OrderItem c);
    OrderItem get(int id);
    List list();
    void fill(List<Order> os);
    void fill(Order o);
    //获取销售量
    int getSaleCount(int  pid);
    List<OrderItem> listByUser(int uid);
}
