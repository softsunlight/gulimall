package com.atguigu.gulimall.coupon.controller;

import com.atguigu.gulimall.coupon.service.MemberPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memberprice")
public class MemberPriceController {

    @Autowired
    private MemberPriceService memberPriceService;

}
