package com.hnust.malldemo.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单表
 * @TableName orders
 */
@TableName(value ="orders")
@Data
public class Orders implements Serializable {
    /**
     * 订单号
     */
    @TableId
    private String id;

    /**
     * 消费者
     */
    private String consumer;

    /**
     * 消费金额
     */
    private Double balance;

    /**
     * 0-消费，1-退款
     */
    private Integer orderType;

    /**
     * 订单时间
     */
    private Date orderTime;

    /**
     * 0-存在，1-删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}