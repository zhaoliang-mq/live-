package com.fh.gift.controller;

import com.fh.gift.service.giftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gift")
public class giftController {

    @Autowired
    private giftService giftService;

}
