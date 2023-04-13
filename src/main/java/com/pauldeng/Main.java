package com.pauldeng;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

public class Main {
    public static void main(String[] args) {
        //创建对象
        AutoGenerator autoGenerator = new AutoGenerator();//自动生成类
        //数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL);
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/dormitory?useUnicode=true&characterEncoding=utf-8&allowMultiQueries=true&useSSL=false");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("dqwdqw789789");
        autoGenerator.setDataSource(dataSourceConfig);
        //全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir")+"/src/main/java");//项目根路径
        globalConfig.setAuthor("admin");
        globalConfig.setOpen(false);
        //去掉Service的I
        globalConfig.setServiceName("%sService");
        autoGenerator.setGlobalConfig(globalConfig);
        //包配置
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent("com.pauldeng");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setServiceImpl("service.impl");
        packageConfig.setController("controller");
        autoGenerator.setPackageInfo(packageConfig);
        //策略配置
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setInclude("absent","building","dormitory","dormitory_admin","moveout","student","system_admin");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);//下划线命名转驼峰命名
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        autoGenerator.setStrategy(strategyConfig);
        //启动
        autoGenerator.execute();
    }
}
