package com.hyxd.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hyxd.gmall.pms.entity.Brand;
import com.hyxd.gmall.pms.mapper.BrandMapper;
import com.hyxd.gmall.pms.service.BrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
@Component
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
