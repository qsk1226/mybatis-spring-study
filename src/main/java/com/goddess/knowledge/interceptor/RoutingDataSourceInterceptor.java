package com.goddess.knowledge.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

/**
 * 数据源路由拦截器
 *
 * @author qinshengke
 * @since 2020/5/30 02:20
 **/
@Slf4j
@Component
@Intercepts({
		@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class}),
		@Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class}),
		@Signature(type = StatementHandler.class, method = "update", args = {Statement.class})
})
public class RoutingDataSourceInterceptor implements Interceptor {

	@Override
	public Object intercept(Invocation invocation) throws Throwable {



		return null;
	}

	@Override
	public Object plugin(Object target) {
		return null;
	}

	@Override
	public void setProperties(Properties properties) {

	}
}
