package com.hnust.malldemo.model.dto.wallet;

import lombok.Data;

/**
 * @author 兰利军
 */
@Data
public class WithdrawalRequest {
    /**
     * 钱包用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String payPassword;
    /**
     * 类型：0-提现，1-充值
     */
    private int type;
    /**
     * 提现金额
     */
    private Double money;
    /**
     * 银行卡账户
     */
    private String cardNumber;
}
