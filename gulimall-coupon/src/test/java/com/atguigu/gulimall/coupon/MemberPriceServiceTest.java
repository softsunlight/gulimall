package com.atguigu.gulimall.coupon;

import com.atguigu.gulimall.coupon.entities.MemberPrice;
import com.atguigu.gulimall.coupon.service.MemberPriceService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MemberPriceServiceTest {

    @Autowired
    private MemberPriceService memberPriceService;
    @Test
    public void listTest(){
        List<MemberPrice> list= memberPriceService.list();
        for (MemberPrice memberPrice:list){
            System.out.println(memberPrice);
        }
    }

}
