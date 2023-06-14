package com.hnust.malldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnust.malldemo.model.entity.Bank;
import org.springframework.stereotype.Service;

/**
* @author HUAWEI
* @description 针对表【bank(银行卡)】的数据库操作Service
* @createDate 2023-06-14 15:12:19
*/
@Service
public interface BankService extends IService<Bank> {

}
