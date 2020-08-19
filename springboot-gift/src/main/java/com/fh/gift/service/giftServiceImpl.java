package com.fh.gift.service;

import com.fh.gift.mapper.giftMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class giftServiceImpl implements giftService {

    @Resource
    private giftMapper giftMapper;
}

