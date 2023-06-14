package com.hnust.malldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnust.malldemo.model.entity.Records;
import com.hnust.malldemo.model.entity.Wallet;
import com.hnust.malldemo.model.vo.WalletVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author HUAWEI
* @description 针对表【wallet(钱包)】的数据库操作Service
* @createDate 2023-06-14 15:25:41
*/
@Service
public interface WalletService extends IService<Wallet> {

    /**
     * 查询用户钱包余额
     * @param userName
     * @param payPassword
     * @return
     */
    WalletVO searchUserBalance(String userName, String payPassword);

    /**
     * 用户钱包金额变动
     * @param username
     * @param type
     * @param money
     * @return
     */
    Boolean balanceChange(String username, Integer type, Double money);
}
