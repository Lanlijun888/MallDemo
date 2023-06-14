package com.hnust.malldemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hnust.malldemo.model.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
* @author HUAWEI
* @description 针对表【orders(订单表)】的数据库操作Mapper
* @createDate 2023-06-14 15:16:48
* @Entity generator.domain.Orders
*/
@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {

}




