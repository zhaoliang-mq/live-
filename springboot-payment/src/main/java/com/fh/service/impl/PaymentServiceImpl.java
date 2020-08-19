package com.fh.service.impl;

import com.fh.common.ServerResponse;
import com.fh.mapper.PaymentMapper;
import com.fh.model.Payment;
import com.fh.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentMapper paymentMapper;


    @Override
    public ServerResponse selectList() {
        List<Payment> payments=paymentMapper.selectList(null);
        return ServerResponse.success(payments);
    }

    @Override
    public ServerResponse addPayment(Payment payment) {
        paymentMapper.insert(payment);
        return ServerResponse.success();
    }

    
}
