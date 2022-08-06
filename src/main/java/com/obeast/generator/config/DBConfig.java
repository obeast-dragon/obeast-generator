package com.obeast.generator.config;

import com.obeast.generator.constant.DBConstant;
import com.obeast.generator.dao.*;
import com.obeast.generator.utils.BeastException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author wxl
 * @version 1.0
 * @description: 数据库配置
 * @date 2022/8/5 15:05
 */
@Configuration
public class DBConfig {

    @Value("${obeast.database}")
    private String database;

    @Autowired
    private MySQLGeneratorDao mySQLGeneratorDao;
    @Autowired
    private OracleGeneratorDao oracleGeneratorDao;
    @Autowired
    private SQLServerGeneratorDao sqlServerGeneratorDao;
    @Autowired
    private PostgreSQLGeneratorDao postgreSQLGeneratorDao;

    @Bean
    @Primary
    public GeneratorDao getGeneratorDao(){
        if(DBConstant.MYSQL.equalsIgnoreCase(database)){
            return mySQLGeneratorDao;
        }else if(DBConstant.ORACLE.equalsIgnoreCase(database)){
            return oracleGeneratorDao;
        }else if(DBConstant.SQLSERVER.equalsIgnoreCase(database)){
            return sqlServerGeneratorDao;
        }else if(DBConstant.POSTGRESQL.equalsIgnoreCase(database)){
            return postgreSQLGeneratorDao;
        }else {
            throw new BeastException("不支持当前数据库：" + database);
        }
    }

}
