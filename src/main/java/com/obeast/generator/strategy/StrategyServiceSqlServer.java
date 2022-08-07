package com.obeast.generator.strategy;


import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.SqlServerGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author wxl
 * Date 2022/8/7 13:20
 * @version 1.0
 * @description: SqlServer策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServiceSqlServer implements StrategyService{

    @Autowired
    private SqlServerGeneratorDao sqlServerGeneratorDao;

    @Override
    public GeneratorDao getGeneratorDao() {
        return sqlServerGeneratorDao;
    }

    @Override
    public String strategyDBName() {
        return DBConstant.SQLSERVER;
    }
}
