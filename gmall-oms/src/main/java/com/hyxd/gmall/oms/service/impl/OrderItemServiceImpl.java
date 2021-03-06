package com.hyxd.gmall.oms.service.impl;

import com.hyxd.gmall.oms.entity.OrderItem;
import com.hyxd.gmall.oms.mapper.OrderItemMapper;
import com.hyxd.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
