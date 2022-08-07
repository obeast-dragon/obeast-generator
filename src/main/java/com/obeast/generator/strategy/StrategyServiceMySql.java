package com.obeast.generator.strategy;


import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.MySqlGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;


/**
 * @author wxl
 * Date 2022/8/7 13:16
 * @version 1.0
 * @description: Mysql策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServiceMySql implements StrategyService{

    @Autowired
    private MySqlGeneratorDao mySQLGeneratorDao;

    @Override
    public GeneratorDao getGeneratorDao() {
        return mySQLGeneratorDao;
    }
    @Override
    public String strategyDBName() {
        return DBConstant.MYSQL;
    }
}
