package com.cityq.product.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cityq.RaiderServiceApi;
import com.cityq.entity.Raiders;
import com.cityq.product.dao.RaidersDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RaidersServiceImpl extends ServiceImpl<RaidersDao, Raiders> implements RaiderServiceApi {
    @Override
    public IPage<Raiders> getRaiders(int uid,int page, int pageSize) {
        IPage<Raiders> p = new Page<>(page, pageSize);
        QueryWrapper<Raiders> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("uid", uid);
        IPage<Raiders> raiders = baseMapper.selectPage(p, queryWrapper);
        return raiders;
    }
}
