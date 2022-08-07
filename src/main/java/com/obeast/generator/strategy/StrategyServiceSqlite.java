package com.obeast.generator.strategy;

import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.GeneratorDao;
import com.obeast.generator.dao.SqliteGeneratorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * @author wxl
 * Date 2022/8/7 13:19
 * @version 1.0
 * @description: Sqlite策略
 */
@Service
@Order(1)
@Lazy
public class StrategyServiceSqlite implements StrategyService{

    @Autowired
    private SqliteGeneratorDao sqliteGeneratorDao;

    @Override
    public GeneratorDao getGeneratorDao() {
        return sqliteGeneratorDao;
    }

    @Override
    public String strategyDBName() {
        return DBConstant.SQLITE;
    }
}
