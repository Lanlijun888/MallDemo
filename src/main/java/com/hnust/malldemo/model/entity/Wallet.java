package com.hnust.malldemo.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 钱包
 * @TableName wallet
 */
@TableName(value ="wallet")
@Data
public class Wallet implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 支付密码
     */
    private String payPassword;

    /**
     * 余额
     */
    private Double balance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 钱包余额更新时间
     */
    private Date updateTime;

    /**
     * 0-存在，1-删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}