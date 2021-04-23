package com.cityq;

import com.cityq.entity.Trade;

import java.util.List;

public interface TradeServiceApi {
     List<Trade> getTrades(int uid);
}
