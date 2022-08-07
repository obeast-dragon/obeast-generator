package com.obeast.generator.strategy;


import com.obeast.generator.dao.GeneratorDao;


public interface StrategyService {

    /**
     * 获取生成代码的Dao
     * */
    GeneratorDao getGeneratorDao();

    /**
     * 策略DB名
     * */
    String strategyDBName();

}
