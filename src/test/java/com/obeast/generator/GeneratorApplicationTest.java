package com.obeast.generator;

import com.obeast.generator.config.DBConfig;
import com.obeast.generator.strategy.StrategyDBFactory;
import com.obeast.generator.strategy.StrategyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author wxl
 * @version 1.0
 * @description:
 * @date 2022/8/5 15:08
 */
@SpringBootTest
public class GeneratorApplicationTest {

    @Autowired
    private DBConfig config;

    @Autowired
    StrategyDBFactory strategyDBFactory;

    @Test
    void test() {
//        String database = config.getDatabase();
        StrategyService strategyDBName = strategyDBFactory.getStrategyDBName("21221");
        System.out.println(strategyDBName.getGeneratorDao().getClass());

    }
}
