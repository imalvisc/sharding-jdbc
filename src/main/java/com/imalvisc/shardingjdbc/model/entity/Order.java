package com.imalvisc.shardingjdbc.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 订单表
 *
 * @author chenjiaming
 * @version Id: Order.java, v 0.1 2020-04-28 13:35 chenjiaming Exp $$
 */
@TableName(value = "t_order")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Order {

	/**
	 * 主键id
	 */
	@TableId(type = IdType.AUTO)
	private Integer id;

	/**
	 * 用户id
	 */
	private String userId;

	/**
	 * 订单id
	 */
	private String orderId;

	/**
	 * 创建时间
	 */
	private Date createTime;

	/**
	 * 更新时间
	 */
	private Date updateTime;

	/**
	 * 删除标识
	 */
	private Integer delFlag;

}
