package cityq.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cityq.RaiderServiceApi;
import com.cityq.TradeServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade")
public class TradeController {
    @Autowired
    TradeServiceApi tradeService;

    @Autowired
    RaiderServiceApi raidersService;

    @GetMapping(value = "list")
    public Object getTrades(){
        return raidersService.getRaiders(1451);
    }
}
