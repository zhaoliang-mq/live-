package com.fh.gift.service;

import com.fh.gift.common.ResponseCode;
import com.fh.gift.model.Gift;

public interface giftService {
    ResponseCode addGift(Gift gift);

    ResponseCode queryGiftList();
}
