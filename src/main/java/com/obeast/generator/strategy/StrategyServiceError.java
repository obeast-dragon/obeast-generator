package com.obeast.generator.strategy;


import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.MySqlGeneratorDao;
import com.obeast.generator.utils.BeastException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


/**
 * @author wxl
 * Date 2022/8/7 13:16
 * @version 1.0
 * @description: 不支持当前数据库策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServiceError implements StrategyService{


    @Override
    public GeneratorDao getGeneratorDao() {
        throw new BeastException("不支持当前数据库" );
    }

    @Override
    public String strategyDBName() {
        return DBConstant.ERROR;
    }
}
