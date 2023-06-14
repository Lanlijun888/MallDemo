package com.hnust.malldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hnust.malldemo.model.entity.Bank;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HUAWEI
* @description 针对表【bank(银行卡)】的数据库操作Mapper
* @createDate 2023-06-14 15:12:19
* @Entity generator.domain.Bank
*/
@Mapper
public interface BankMapper extends BaseMapper<Bank> {

}




