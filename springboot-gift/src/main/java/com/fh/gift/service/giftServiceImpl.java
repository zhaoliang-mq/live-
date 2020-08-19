package com.fh.gift.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fh.gift.common.ResponseCode;
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
    public ResponseCode addGift(Gift gift) {
        giftMapper.insert(gift);
        return ResponseCode.success();
    }

    @Override
    public ResponseCode queryGiftList() {
        List<Gift> giftList = giftMapper.selectList(null);
            return ResponseCode.success(giftList);
    }
}

