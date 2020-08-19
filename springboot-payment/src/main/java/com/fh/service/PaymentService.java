package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.Payment;

public interface PaymentService {
    ServerResponse selectList();

    ServerResponse addPayment(Payment payment);
}
