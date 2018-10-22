package com.mhi.ikasan.autoconfiguration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("ikasan")
public class IkasanProperties {
    private String driverClassName = "org.h2.jdbcx.JdbcDataSource";
    private String url = "jdbc:h2:mem:one;DB_CLOSE_DELAY=-1";
    private String username = "sa";
    private String password = "sa";

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
