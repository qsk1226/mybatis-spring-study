package com.goddess.knowledge.interceptor;

import com.alibaba.druid.pool.DruidPooledPreparedStatement;
import com.alibaba.druid.proxy.jdbc.ConnectionProxyImpl;
import com.alibaba.druid.proxy.jdbc.PreparedStatementProxyImpl;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.logging.jdbc.PreparedStatementLogger;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;

/**
 * 统计MyBatis执行sql的时长
 *
 * @author qinshengke
 * @since 2020/5/24 23:28
 **/
@Slf4j
@Component
@Intercepts({@Signature(type = StatementHandler.class, method = "query", args = {Statement.class, ResultHandler.class})})
public class SqlExecuteTimeInterceptor implements Interceptor {
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		long preTime = System.currentTimeMillis();
		Object proceed = invocation.proceed();
		long afterTime = System.currentTimeMillis();
		// query方法 此处是一个statement的代理对象
		Object statementProxy = invocation.getArgs()[0];
		MetaObject metaObject = null;
		String sql = null;
		// druid数据源
		if (statementProxy instanceof DruidPooledPreparedStatement) {
			metaObject = SystemMetaObject.forObject(statementProxy);
			sql = metaObject.getValue("sql").toString();
		}


		log.info("执行sql语句：{}查询所耗时间为:{} ms", sql.toString(), afterTime - preTime);
		return proceed;
	}

	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {

	}
}
