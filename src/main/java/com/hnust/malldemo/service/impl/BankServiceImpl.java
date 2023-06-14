package com.hnust.malldemo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnust.malldemo.mapper.BankMapper;
import com.hnust.malldemo.model.entity.Bank;
import com.hnust.malldemo.service.BankService;
import org.springframework.stereotype.Service;

/**
* @author HUAWEI
* @description 针对表【bank(银行卡)】的数据库操作Service实现
* @createDate 2023-06-14 15:12:19
*/
@Service
public class BankServiceImpl extends ServiceImpl<BankMapper, Bank>
    implements BankService {

}




