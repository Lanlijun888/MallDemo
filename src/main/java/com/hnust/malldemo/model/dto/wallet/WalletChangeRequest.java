package com.hnust.malldemo.model.dto.wallet;

import lombok.Data;

/**
 * @author 兰利军
 */
@Data
public class WalletChangeRequest {
    /**
     * 用户名
     */
    private String username;
    /**
     * 消费类型
     * 0-消费，1-退款
     */
    private Integer type;
    /**
     * 金额
     */
    private Double money;
}
