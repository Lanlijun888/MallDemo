package com.hnust.malldemo.controller;

import com.hnust.malldemo.common.BaseResponse;
import com.hnust.malldemo.common.ErrorCode;
import com.hnust.malldemo.model.dto.orders.OrdersAddRequest;
import com.hnust.malldemo.model.dto.wallet.WalletChangeRequest;
import com.hnust.malldemo.model.dto.wallet.WalletQueryRequest;
import com.hnust.malldemo.model.dto.wallet.WithdrawalRequest;
import com.hnust.malldemo.model.entity.Records;
import com.hnust.malldemo.model.vo.RecordVO;
import com.hnust.malldemo.model.vo.WalletVO;
import com.hnust.malldemo.service.BankService;
import com.hnust.malldemo.service.OrdersService;
import com.hnust.malldemo.service.RecordsService;
import com.hnust.malldemo.service.WalletService;
import com.hnust.malldemo.utils.ResultUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 兰利军
 */
@RestController
@RequestMapping("/wallet")
public class ConsumeController {
    @Resource
    private WalletService walletService;

    @Resource
    private RecordsService recordsService;

    @Resource
    private OrdersService ordersService;

    /**
     * 查询用户钱包余额
     * @param walletQueryRequest
     * @return
     */
    @PostMapping("/searchWalletBalance")
    public BaseResponse<WalletVO> searchUserBalance(@RequestBody WalletQueryRequest walletQueryRequest){
        String userName = walletQueryRequest.getUserName();
        String payPassword = walletQueryRequest.getPayPassword();
        WalletVO walletVO = walletService.searchUserBalance(userName, payPassword);
        return walletVO != null ? ResultUtils.success(walletVO) : ResultUtils.error(ErrorCode.PARAMS_ERROR,"用户不存在");
    }

    /**
     * 用户钱包消费和退款，type表示，0-消费，1-退款
     * @param walletChangeRequest
     * @return
     */
    @PostMapping("/consume")
    public BaseResponse<String> balanceChange(@RequestBody WalletChangeRequest walletChangeRequest){
        // 用户名
        String username = walletChangeRequest.getUsername();
        // 类型，0-消费，1-退款
        Integer type = walletChangeRequest.getType();
        // 对应金额
        Double money = walletChangeRequest.getMoney();
        Boolean isSuccessful = walletService.balanceChange(username,type,money);
        return isSuccessful ? ResultUtils.success(null) : ResultUtils.error(ErrorCode.SYSTEM_ERROR,"钱包余额不足");
    }

    /**
     * 查询用户钱包金额变动
     * @param userName
     * @return
     */
    @GetMapping("/searchRecords/{userName}")
    public BaseResponse<List<RecordVO>> searchRecords(@PathVariable String userName){
        List<RecordVO> recordsList = recordsService.searchRecords(userName);
        return ResultUtils.success(recordsList);
    }

    /**
     * 订单记录
     * @param ordersAddRequest
     * @return
     */
    @PostMapping("/addOrders")
    public BaseResponse<Records> addOrder(@RequestBody OrdersAddRequest ordersAddRequest){
     Boolean successful = ordersService.addOrder(ordersAddRequest);
     return successful ? ResultUtils.success(null) : ResultUtils.error(ErrorCode.OPERATION_ERROR,"操作失败，请稍后再试！");
    }
}
