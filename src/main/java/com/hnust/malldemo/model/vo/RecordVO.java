package com.hnust.malldemo.model.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @author 兰利军
 */
@Data
public class RecordVO {
    /**
     * 订单号
     */
    @TableId
    private Long id;

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
    private String orderType;

    /**
     * 订单时间
     */
    private Date orderTime;
}
