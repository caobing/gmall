package com.hyxd.gmall.pms;

import com.hyxd.gmall.pms.entity.Brand;
import com.hyxd.gmall.pms.service.BrandService;
import com.hyxd.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {
    @Autowired
    ProductService productService;
    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {
        /*Product product = productService.getById(1);
        System.out.println(product.getName());*/
        //测试增删改在主库，查询在从库
        /*brandService.removeById(53);
        Brand brand = new Brand();
        brand.setName("哈哈哈");*/
        Brand brand = brandService.getById(54);
        System.out.println(brand.getName());

    }

}
