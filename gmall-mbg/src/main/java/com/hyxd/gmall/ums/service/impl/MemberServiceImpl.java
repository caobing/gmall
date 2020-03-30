package com.hyxd.gmall.ums.service.impl;

import com.hyxd.gmall.ums.entity.Member;
import com.hyxd.gmall.ums.mapper.MemberMapper;
import com.hyxd.gmall.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author bing
 * @since 2020-03-28
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
