package com.fh.gift.service;

import com.fh.common.ServerResponse;
import com.fh.gift.mapper.giftMapper;
import com.fh.gift.model.Gift;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class giftServiceImpl implements giftService {

    @Resource
    private giftMapper giftMapper;

    @Override
    public ServerResponse addGift(Gift gift) {
        giftMapper.insert(gift);
        return ServerResponse.success();
    }

    @Override
    public ServerResponse queryGiftList() {
        List<Gift> giftList = giftMapper.selectList(null);
            return ServerResponse.success(giftList);
    }
}

