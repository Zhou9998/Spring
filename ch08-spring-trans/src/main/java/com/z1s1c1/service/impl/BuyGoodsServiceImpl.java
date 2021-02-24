package com.z1s1c1.service.impl;

import com.z1s1c1.dao.GoodsDao;
import com.z1s1c1.dao.SaleDao;
import com.z1s1c1.domain.Goods;
import com.z1s1c1.domain.Sale;
import com.z1s1c1.excep.NotEnoughException;
import com.z1s1c1.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("buy方法的开始");
        //记录销售的信息，像sale表增加信息
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            //商品不存在
            throw new NullPointerException("编号是"+goodsId+"的商品不存在");
        }else if (goods.getAmount()<nums){
            //商品库存不足
            throw new NotEnoughException("编号是"+goodsId+"的商品库存不足");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("buy方法的完成");
    }
}
