package com.obeast.generator.strategy;


import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.OracleGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wxl
 * Date 2022/8/7 13:20
 * @version 1.0
 * @description: Oracle策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServiceOracle implements StrategyService{

    @Autowired
    private OracleGeneratorDao oracleGeneratorDao;

    @Override
    public GeneratorDao getGeneratorDao() {
        return oracleGeneratorDao;
    }

    @Override
    public String strategyDBName() {
        return DBConstant.ORACLE;
    }
}
