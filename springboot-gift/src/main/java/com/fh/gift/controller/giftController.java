package com.fh.gift.controller;

import com.fh.gift.common.ResponseCode;
import com.fh.gift.model.Gift;
import com.fh.gift.service.giftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gift")
public class giftController {

    @Autowired
    private giftService giftService;

    //添加礼物
    @RequestMapping("addGift")
    public ResponseCode addGift(Gift gift){
        return giftService.addGift(gift);
    }

    //查询礼物数据礼物
    @RequestMapping("queryGiftList")
    public ResponseCode queryGiftList(){
        return giftService.queryGiftList();
    }
}
