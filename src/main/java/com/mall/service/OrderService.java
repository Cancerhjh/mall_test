package com.mall.service;

import com.mall.pojo.Order;
import com.mall.pojo.OrderItem;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";
    void add(Order c);


    float add(Order o, List<OrderItem> ois);

    void delete(int id);
    void update(Order c);
    Order get(int id);
    List list();

    List list(int uid, String excludedStatus);

}
