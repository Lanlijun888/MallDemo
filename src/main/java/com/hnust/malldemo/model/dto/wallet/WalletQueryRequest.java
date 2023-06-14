package com.hnust.malldemo.model.dto.wallet;

import lombok.Data;

/**
 * @author 兰利军
 */
@Data
public class WalletQueryRequest {
    /**
     * 钱包用户名
     */
    private String userName;

    /**
     * 钱包支付密码
     */
    private String payPassword;
}
