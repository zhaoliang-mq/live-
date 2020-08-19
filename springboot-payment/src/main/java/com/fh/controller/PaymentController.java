package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.Payment;
import com.fh.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("PaymentController")
@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    //查询金额
    @RequestMapping("selectList")
    public ServerResponse selectList(){
        return paymentService.selectList();
    }

    //充值金额
    @RequestMapping("addPayment")
    public ServerResponse addPayment(Payment payment){

        return paymentService.addPayment(payment);
    }
}
