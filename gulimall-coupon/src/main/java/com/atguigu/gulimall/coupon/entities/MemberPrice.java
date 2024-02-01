package com.atguigu.gulimall.coupon.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberPrice {

    private Long id;

    private Long skuId;

    private Long memberLevelId;

    private String memberLevelName;

    private Double memberPrice;

    private Boolean addOther;

}
