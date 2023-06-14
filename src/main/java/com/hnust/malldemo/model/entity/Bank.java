package com.hnust.malldemo.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 银行卡
 * @TableName bank
 */
@TableName(value ="bank")
@Data
public class Bank implements Serializable {
    /**
     * 编号
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 银行卡号
     */
    private String cardNumber;

    /**
     * 账户名
     */
    private String userAccount;

    /**
     * 银行卡密码
     */
    private String cardPassword;

    /**
     * 金额
     */
    private Double balance;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 银行卡信息变更时间
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