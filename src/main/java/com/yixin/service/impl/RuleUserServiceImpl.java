package com.yixin.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yixin.mapper.RuleUserMapper;
import com.yixin.model.RuleUser;
import com.yixin.model.request.RuleUserRequest;
import com.yixin.service.RuleUserService;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.text.MessageFormat;
import java.util.List;
import java.util.UUID;

/*
 * Created by shaomaolin on 2018/10/23.
 *
*/
@Log4j2
@Service("RuleUserService")
public class RuleUserServiceImpl implements RuleUserService{

    @Autowired
    private RuleUserMapper ruleUserMapper;

    @Override
    public RuleUser queryOne(String id) {

        return ruleUserMapper.selectByPrimaryKey(id);

    }

    @Override
    public PageInfo<RuleUser> pageRuleUsers(RuleUserRequest request) {
        Example example = new Example(RuleUser.class);
        Example.Criteria criteria = example.createCriteria();

        if (StringUtils.isNotBlank(request.getAddress())) {
            criteria.andLike("address", MessageFormat.format("%{0}%", request.getAddress()));
        }

        if (StringUtils.isNotBlank(request.getUserName())) {
            criteria.andLike("userName", MessageFormat.format("%{0}%", request.getUserName()));
        }

        PageHelper.startPage(request.getCurrentPage(), request.getPageSize());
        List<RuleUser> userList = ruleUserMapper.selectByExample(example);

        PageInfo<RuleUser> pageInfo = new PageInfo<>(userList);

        return pageInfo;
    }

    @Override
    public RuleUser addRuleUser(RuleUserRequest request) {

        RuleUser ruleUser = new RuleUser();

        try {
            BeanUtils.copyProperties(request, ruleUser);
            String id = UUID.randomUUID().toString();
            ruleUser.setId(id);

            int count = ruleUserMapper.insertSelective(ruleUser);

            if (count <= 0) {
                throw new RuntimeException("插入用户数据失败！");
            }

            return ruleUser;

        } catch (BeansException e) {
            log.error("插入用户数据失败！", e);
            throw new RuntimeException("插入用户数据失败！");
        }
    }
}

