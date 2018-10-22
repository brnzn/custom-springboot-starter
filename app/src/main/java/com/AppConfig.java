package com;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //Uncomment to override
    //@Bean("ikasan.ds")
    public BasicDataSource ikasanXaDataSourceInstance() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/my_database");
        dataSource.setPassword("user");
        dataSource.setUsername("password");

        return dataSource;

    }
}
