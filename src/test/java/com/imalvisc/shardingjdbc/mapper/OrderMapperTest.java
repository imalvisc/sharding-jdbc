package com.imalvisc.shardingjdbc.mapper;

import com.imalvisc.shardingjdbc.AbstractTest;
import com.imalvisc.shardingjdbc.model.entity.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.UUID;

/**
 * 订单数据访问单元测试
 *
 * @author chenjiaming
 * @version Id: OrderMapperTest.java, v 0.1 2020-04-28 13:43 chenjiaming Exp $$
 */
public class OrderMapperTest extends AbstractTest {

	@Autowired
	private OrderMapper orderMapper;

	@Test
	public void testInsert() {
		Order order = Order.builder()
				.userId("123456")
				.orderId(UUID.randomUUID().toString().replace("-", ""))
				.createTime(new Date())
				.updateTime(new Date())
				.delFlag(1)
				.build();
		orderMapper.insert(order);
	}

}
