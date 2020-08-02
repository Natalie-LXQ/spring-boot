package com.atguigu.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigAutoconfigApplicationTests {

	//记录器
	Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	DataSource dataSource;

	@Test
	public void jdbcTest() throws SQLException{
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		connection.close();
	}


	@Test
	public void contextLoads() {
		logger.trace("trace logging");
		logger.debug("debug longging");
		logger.info("info logging");
		logger.warn("warn logging");
		logger.error("error logging");
	}



}
