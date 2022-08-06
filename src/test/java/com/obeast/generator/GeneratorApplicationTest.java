package com.obeast.generator;

import com.obeast.generator.config.DBConfig;
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
    DBConfig dbConfig;


    @Test
    void test() {
    }
}
