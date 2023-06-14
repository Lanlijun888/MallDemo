package com.hnust.malldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnust.malldemo.model.dto.orders.OrdersAddRequest;
import com.hnust.malldemo.model.entity.Orders;
import org.springframework.stereotype.Service;

/**
* @author HUAWEI
* @description 针对表【orders(订单表)】的数据库操作Service
* @createDate 2023-06-14 15:16:48
*/
@Service
public interface OrdersService extends IService<Orders> {

    /**
     * 添加订单
     * @param ordersAddRequest
     * @return
     */
    Boolean addOrder(OrdersAddRequest ordersAddRequest);
}
