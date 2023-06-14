package com.hnust.malldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hnust.malldemo.model.entity.Wallet;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
* @author HUAWEI
* @description 针对表【wallet(钱包)】的数据库操作Mapper
* @createDate 2023-06-14 15:25:41
* @Entity generator.domain.Wallet
*/
@Mapper
public interface WalletMapper extends BaseMapper<Wallet> {
    /**
     * 更新用户钱包
     * @param userName
     * @param money
     * @return
     */
    public int balanceChange(String userName,double money);
}




