package com.yixin.service.impl;

import com.github.pagehelper.Page;
import com.yixin.mapper.RuleUserMapper;
import com.yixin.model.RuleUser;
import com.yixin.model.RuleUserExample;
import com.yixin.model.request.RuleUserRequest;
import com.yixin.service.RuleUserService;
import org.springframework.beans.factory.annotation.Autowired;

/*
 * Created by shaomaolin on 2018/10/23.
 *
*/

public class RuleUserServiceImpl implements RuleUserService{

    @Autowired
    private RuleUserMapper ruleUserMapper;

    @Override
    public RuleUser queryOne(String id) {
       return ruleUserMapper.selectByPrimaryKey(id);
    }

    @Override
    public Page<RuleUser> pageRuleUsers(RuleUserRequest request) {
        return null;
    }

    @Override
    public RuleUser addRuleUser(RuleUserRequest request) {
        return null;
    }
}

