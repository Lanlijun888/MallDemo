package com.hnust.malldemo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hnust.malldemo.model.entity.Records;
import com.hnust.malldemo.model.vo.RecordVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author HUAWEI
* @description 针对表【records(金额变动记录表)】的数据库操作Service
* @createDate 2023-06-14 15:23:11
*/
@Service
public interface RecordsService extends IService<Records> {

    /**
     * 查询用户钱包金额变动明细
     * @param userName
     * @return
     */
    List<RecordVO> searchRecords(String userName);
}
