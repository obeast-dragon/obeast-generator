package com.obeast.generator.strategy;

import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.utils.BeastException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wxl
 * Date 2022/8/7 15:02
 * @version 1.0
 * @description: 策略环境
 */
@Component
@Lazy
public class StrategyDBFactory {

    @Autowired
    private List<StrategyService> strategyServices;

    private final Map<String, StrategyService> stringGeneratorDaoMap = new HashMap<>();

    @PostConstruct
    public void registerStrategyServices() {
        strategyServices.forEach(t -> stringGeneratorDaoMap.put(t.strategyDBName(), t));
    }

    public StrategyService getStrategyDBName(String strategyDBName) {
        if (strategyDBName == null) {
            throw new BeastException("StrategyDBName cannot be null");
        }
        StrategyService strategyService = stringGeneratorDaoMap.get(strategyDBName);
        if (strategyService == null) {
            return stringGeneratorDaoMap.get(DBConstant.ERROR);
        }else {
            return strategyService;
        }

    }

}
