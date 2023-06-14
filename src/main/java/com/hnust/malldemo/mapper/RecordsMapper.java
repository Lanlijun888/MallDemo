package com.hnust.malldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hnust.malldemo.model.entity.Records;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HUAWEI
* @description 针对表【records(金额变动记录表)】的数据库操作Mapper
* @createDate 2023-06-14 15:23:11
* @Entity generator.domain.Records
*/
@Mapper
public interface RecordsMapper extends BaseMapper<Records> {

}




