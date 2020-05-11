package com.imalvisc.shardingjdbc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序启动类
 *
 * @author chenjiaming
 * @version Id: ShardingJdbcApplication.java, v 0.1 2020-04-28 12:22 chenjiaming Exp $$
 */
@SpringBootApplication
@MapperScan("com.imalvisc.shardingjdbc.mapper")
public class ShardingJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShardingJdbcApplication.class);
	}

}
