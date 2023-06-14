package com.hnust.malldemo.model.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 金额变动记录表
 * @TableName records
 */
@TableName(value ="records")
@Data
public class Records implements Serializable {
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
     * 0-支出，1-收入
     */
    private Integer type;

    /**
     * 金额
     */
    private Double balance;

    /**
     * 记录时间
     */
    private Date time;

    /**
     * 0-存在，1-删除
     */
    @TableLogic
    private Integer isDelete;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}