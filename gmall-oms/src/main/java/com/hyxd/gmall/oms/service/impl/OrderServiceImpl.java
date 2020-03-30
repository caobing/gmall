package com.hyxd.gmall.oms.service.impl;

import com.hyxd.gmall.oms.entity.Order;
import com.hyxd.gmall.oms.mapper.OrderMapper;
import com.hyxd.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
