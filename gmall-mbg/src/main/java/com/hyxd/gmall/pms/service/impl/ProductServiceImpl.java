package com.hyxd.gmall.pms.service.impl;

import com.hyxd.gmall.pms.entity.Product;
import com.hyxd.gmall.pms.mapper.ProductMapper;
import com.hyxd.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
