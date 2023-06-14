package com.hnust.malldemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hnust.malldemo.mapper.RecordsMapper;
import com.hnust.malldemo.model.entity.Records;
import com.hnust.malldemo.model.vo.RecordVO;
import com.hnust.malldemo.service.RecordsService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
* @author HUAWEI
* @description 针对表【records(金额变动记录表)】的数据库操作Service实现
* @createDate 2023-06-14 15:23:11
*/
@Service
public class RecordsServiceImpl extends ServiceImpl<RecordsMapper, Records>
    implements RecordsService {

    @Override
    public List<RecordVO> searchRecords(String userName) {
        LambdaQueryWrapper<Records> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        lambdaQueryWrapper.eq(Records::getUserName,userName);
        List<Records> list = this.list(lambdaQueryWrapper);
        List<RecordVO> res = new ArrayList<>();

        for (Records records : list) {
            RecordVO recordVO = new RecordVO();
            recordVO.setId(records.getId());
            recordVO.setConsumer(records.getUserName());
            recordVO.setBalance(records.getBalance());
            String type = records.getType() == 0 ? "消费" : "退款";
            recordVO.setOrderType(type);
            recordVO.setOrderTime(records.getTime());
            res.add(recordVO);
        }
        return res;
    }
}




