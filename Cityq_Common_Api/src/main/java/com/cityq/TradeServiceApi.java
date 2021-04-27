package com.cityq;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.cityq.entity.Raiders;
import com.cityq.entity.Trade;
import java.util.List;

public interface TradeServiceApi {
     IPage<Trade> getTrades(int uid, int page, int pageSize);
}
