package com.z1s1c1.dao;

import com.z1s1c1.domain.Goods;

public interface GoodsDao {
    //更新库存
    //goods表示本次用户购买的商品信息 ,id, amount
    int updateGoods(Goods goods);

    //查询商品的信息
    Goods selectGoods(Integer id);
}
