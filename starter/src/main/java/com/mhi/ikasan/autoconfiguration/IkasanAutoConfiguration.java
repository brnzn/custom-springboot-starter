package com.mhi.ikasan.autoconfiguration;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(BasicDataSource.class)
@EnableConfigurationProperties(IkasanProperties.class)
public class IkasanAutoConfiguration {

	private final IkasanProperties properties;

	public IkasanAutoConfiguration(IkasanProperties properties) {
		this.properties = properties;
	}

	@Bean("ikasan.ds")
	@ConditionalOnMissingBean(name = "ikasan.ds")
	public BasicDataSource ikasanXaDataSourceInstance() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(properties.getDriverClassName());
		dataSource.setUrl(properties.getUrl());
		dataSource.setPassword(properties.getPassword());
		dataSource.setUsername(properties.getUsername());

		return dataSource;

	}

}