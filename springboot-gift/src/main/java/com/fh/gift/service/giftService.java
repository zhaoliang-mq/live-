package com.fh.gift.service;

import com.fh.common.ServerResponse;
import com.fh.gift.model.Gift;

public interface giftService {
    ServerResponse addGift(Gift gift);

    ServerResponse queryGiftList();
}
