package com.goddess.knowledge;

import com.alibaba.druid.pool.DruidDataSource;
import com.sun.xml.internal.bind.v2.util.DataSourceSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * TODO
 *
 * @author qinshengke
 * @since 2021/2/3
 **/
@Component
@ComponentScan(basePackages = {"com.goddess.knowledge"})
//@MapperScan(basePackages = {"com.goddess.knowledge.mapper"})
@EnableTransactionManagement
public class ComponentConfig {

	//@Bean
	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSources) {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		//sqlSessionFactoryBean.setMapperLocations(resolver.getResource("classpath*:mapper/**/*.xml"));
		sqlSessionFactoryBean.setDataSource(dataSources);
		return sqlSessionFactoryBean;
	}

	//@Bean
	public DataSource dataSource() throws IOException {
		ClassPathResource classPathResource = new ClassPathResource("/db.properties");
		Properties properties = PropertiesLoaderUtils.loadProperties(classPathResource);
		DruidDataSource druidDataSource = new DruidDataSource();
		druidDataSource.setUrl(properties.getProperty("jdbc_url"));

		return druidDataSource;
	}

}
