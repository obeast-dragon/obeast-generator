package com.obeast.generator.strategy;

import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.PostgreSqlGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author wxl
 * Date 2022/8/7 13:15
 * @version 1.0
 * @description: PostgreSQl策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServicePostgreSql implements StrategyService{

    @Autowired
    private PostgreSqlGeneratorDao postgreSqlGeneratorDao;

    @Override
    public GeneratorDao getGeneratorDao() {
        return postgreSqlGeneratorDao;
    }

    @Override
    public String strategyDBName() {
        return DBConstant.POSTGRESQL;
    }
}
