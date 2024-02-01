package com.atguigu.gulimall.coupon.service.impl;

import com.atguigu.gulimall.coupon.entities.MemberPrice;
import com.atguigu.gulimall.coupon.mapper.MemberPriceMapper;
import com.atguigu.gulimall.coupon.service.MemberPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPrice> implements MemberPriceService {
}
