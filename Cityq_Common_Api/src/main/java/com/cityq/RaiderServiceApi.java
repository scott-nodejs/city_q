package com.cityq;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cityq.entity.Raiders;

import java.util.List;

public interface RaiderServiceApi extends IService<Raiders> {

    IPage<Raiders> getRaiders(int uid, int page, int pageSize);
}
