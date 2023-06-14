package com.hnust.malldemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnust.malldemo.mapper.WalletMapper;
import com.hnust.malldemo.model.entity.Records;
import com.hnust.malldemo.model.entity.Wallet;
import com.hnust.malldemo.model.vo.WalletVO;
import com.hnust.malldemo.service.WalletService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
* @author HUAWEI
* @description 针对表【wallet(钱包)】的数据库操作Service实现
* @createDate 2023-06-14 15:25:41
*/
@Service
public class WalletServiceImpl extends ServiceImpl<WalletMapper, Wallet>
    implements WalletService {

    @Resource
    private WalletMapper walletMapper;

    @Override
    public WalletVO searchUserBalance(String userName, String payPassword) {
        LambdaQueryWrapper<Wallet> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Wallet::getUserName,userName);
        lambdaQueryWrapper.eq(Wallet::getPayPassword,payPassword);
        Wallet wallet = this.getOne(lambdaQueryWrapper);
        WalletVO walletVO = new WalletVO();
        if(wallet != null){
            walletVO.setUserName(wallet.getUserName());
            walletVO.setBalance(wallet.getBalance());
        }
        return walletVO;
    }

    @Override
    public Boolean balanceChange(String username, Integer type, Double money) {
        if(type != 0){
            money = -money;
        }
        int flag = walletMapper.balanceChange(username, money);

        return flag > 0;
    }
}




