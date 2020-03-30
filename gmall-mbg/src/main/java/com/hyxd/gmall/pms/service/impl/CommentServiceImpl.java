package com.hyxd.gmall.pms.service.impl;

import com.hyxd.gmall.pms.entity.Comment;
import com.hyxd.gmall.pms.mapper.CommentMapper;
import com.hyxd.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
