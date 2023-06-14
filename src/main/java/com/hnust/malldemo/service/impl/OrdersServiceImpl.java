package com.hnust.malldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnust.malldemo.mapper.OrdersMapper;
import com.hnust.malldemo.model.dto.orders.OrdersAddRequest;
import com.hnust.malldemo.model.entity.Orders;
import com.hnust.malldemo.service.OrdersService;
import org.springframework.stereotype.Service;

/**
* @author HUAWEI
* @description 针对表【orders(订单表)】的数据库操作Service实现
* @createDate 2023-06-14 15:16:48
*/
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders>
    implements OrdersService {

    @Override
    public Boolean addOrder(OrdersAddRequest ordersAddRequest) {
        Orders orders = new Orders();
        orders.setId(ordersAddRequest.getId());
        orders.setConsumer(ordersAddRequest.getConsumer());
        orders.setBalance(ordersAddRequest.getBalance());
        orders.setOrderType(ordersAddRequest.getOrderType());
        boolean save = this.save(orders);
        return save;
    }
}




