package com.cityq.product.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cityq.TradeServiceApi;
import com.cityq.entity.Trade;
import com.cityq.product.dao.TradeDao;
import org.springframework.stereotype.Component;


import java.util.List;

@Service
@Component
public class TradeServiceImpl extends ServiceImpl<TradeDao, Trade> implements TradeServiceApi, IService<Trade> {
    @Override
    public IPage<Trade> getTrades(int uid, int page, int pageSize) {
        IPage<Trade> p = new Page<>(page, pageSize);
        QueryWrapper<Trade> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", uid);
        IPage<Trade> trades = baseMapper.selectPage(p, queryWrapper);
        return trades;
    }
}
