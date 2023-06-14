package com.hnust.malldemo.model.dto.orders;

import lombok.Data;

/**
 * @author 兰利军
 */
@Data
public class OrdersAddRequest {
    /**
     * 订单号
     */
    private String id;
    /**
     * 消费者
     */
    private String consumer;
    /**
     * 类型：消费？退款
     */
    private int orderType;
    /**
     * 金额
     */
    private Double balance;
}
