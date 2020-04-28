package com.imalvisc.shardingjdbc;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 单元测试抽象类
 *
 * @author chenjiaming
 * @version Id: AbstractTest.java, v 0.1 2020-04-28 13:41 chenjiaming Exp $$
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingJdbcApplication.class)
public abstract class AbstractTest {
}
